package br.com.etec.guilherme.locadoraApi.repository.filme;

import br.com.etec.guilherme.locadoraApi.model.Filme;
import br.com.etec.guilherme.locadoraApi.repository.filter.FilmeFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface FilmeRepositoryQuery {

    public Page<Filme> filtrar(FilmeFilter filmeFilter, Pageable pageable);

}
