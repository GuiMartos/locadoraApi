package br.com.etec.guilherme.locadoraApi.repository.ator;

import br.com.etec.guilherme.locadoraApi.model.Ator;
import br.com.etec.guilherme.locadoraApi.repository.filter.AtorFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface AtorRespositoryQuery {

    public Page<Ator> filtrar(AtorFilter atorFilter, Pageable pageable);

}
