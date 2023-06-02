package br.com.etec.guilherme.locadoraApi.repository.filme;

import br.com.etec.guilherme.locadoraApi.model.Filme;
import br.com.etec.guilherme.locadoraApi.repository.filter.FilmeFilter;
import br.com.etec.guilherme.locadoraApi.repository.projections.ResumoFilme;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface FilmeRepositoryQuery {

    public Page<ResumoFilme> filtrar(FilmeFilter filmeFilter, Pageable pageable);

}
