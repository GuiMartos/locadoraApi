package br.com.etec.guilherme.locadoraApi.resource;

import br.com.etec.guilherme.locadoraApi.model.Filme;
import br.com.etec.guilherme.locadoraApi.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/filmes")
public class FilmeResource {

    @Autowired
    private FilmeRepository filmeRepository;

    @GetMapping("/todos")
    public List<Filme> listarTodosFilmes(){
        return filmeRepository.findAll(Sort.by("nomefilme").ascending());
    }
}
