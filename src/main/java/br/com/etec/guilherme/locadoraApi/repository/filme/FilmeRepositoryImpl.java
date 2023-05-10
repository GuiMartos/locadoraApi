package br.com.etec.guilherme.locadoraApi.repository.filme;

import br.com.etec.guilherme.locadoraApi.model.Filme;
import br.com.etec.guilherme.locadoraApi.repository.filter.FilmeFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class FilmeRepositoryImpl implements FilmeRepositoryQuery{


    @Override
    public Page<Filme> filtrar(FilmeFilter filmeFilter, Pageable pageable) {
        return null;
    }
}
