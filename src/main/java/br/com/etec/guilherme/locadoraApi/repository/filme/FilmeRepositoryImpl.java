package br.com.etec.guilherme.locadoraApi.repository.filme;

import br.com.etec.guilherme.locadoraApi.model.Filme;
import br.com.etec.guilherme.locadoraApi.repository.filter.FilmeFilter;
import br.com.etec.guilherme.locadoraApi.repository.projections.ResumoFilme;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class FilmeRepositoryImpl implements FilmeRepositoryQuery{

    @PersistenceContext
    private EntityManager manager;

    @Override
    public Page<ResumoFilme> filtrar(FilmeFilter filmeFilter, Pageable pageable) {

        CriteriaBuilder builder = manager.getCriteriaBuilder();
        CriteriaQuery<ResumoFilme> criteria = builder.createQuery(ResumoFilme.class);
        Root<Filme> root = criteria.from(Filme.class);

        criteria.select(builder.construct(ResumoFilme.class

                ,root.get("id")
                ,root.get("nomefilme")
                ,root.get("genero").get("descricao")
                ,root.get("ator").get("nomeator")

        ));

        Predicate[] predicates = criarRestricoes(filmeFilter, builder, root);
        criteria.where(predicates);
        criteria.orderBy(builder.asc(root.get("nomefilme")));

        TypedQuery<ResumoFilme> query = manager.createQuery(criteria);
        adicionarRestricoesDePaginacao(query, pageable);

        return new PageImpl<>(query.getResultList(), pageable, total(filmeFilter));
    }

    private Long total(FilmeFilter filmeFilter){
        CriteriaBuilder builder = manager.getCriteriaBuilder();
        CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
        Root<Filme> root = criteria.from(Filme.class);

        Predicate[] predicates = criarRestricoes(filmeFilter, builder, root);
        criteria.where(predicates);
        criteria.orderBy(builder.asc(root.get("nomefilme")));

        criteria.select(builder.count(root));
        return manager.createQuery(criteria).getSingleResult();

    }

    private void adicionarRestricoesDePaginacao(TypedQuery<?> query, Pageable pageable) {

        int paginaAtual = pageable.getPageNumber();
        int totalRegistros = pageable.getPageSize();
        int primeiroRegistroDaPagina = paginaAtual * totalRegistros;

        query.setFirstResult(primeiroRegistroDaPagina);
        query.setMaxResults(totalRegistros);
    }

    private Predicate[] criarRestricoes(FilmeFilter filmeFilter, CriteriaBuilder builder, Root<Filme> root) {
        List<Predicate> predicates = new ArrayList<>();

        if (!StringUtils.isEmpty(filmeFilter.getNomefilme())) {
            predicates.add(builder.like(builder.lower(root.get("nomefilme")),
                    "%" + filmeFilter.getNomefilme().toLowerCase() + "%"));
        }

        if (!StringUtils.isEmpty(filmeFilter.getNomefilme())) {
            predicates.add(builder.like(builder.lower(root.get("genero").get("desricao")),
                    "%" + filmeFilter.getNomegenero().toLowerCase() + "%"));
        }

        if (!StringUtils.isEmpty(filmeFilter.getNomefilme())) {
            predicates.add(builder.like(builder.lower(root.get("ator").get("nomeator")),
                    "%" + filmeFilter.getNomeator().toLowerCase() + "%"));
        }

        return predicates.toArray((new Predicate[predicates.size()]));
    }
}