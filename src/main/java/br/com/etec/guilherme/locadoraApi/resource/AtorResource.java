package br.com.etec.guilherme.locadoraApi.resource;


import br.com.etec.guilherme.locadoraApi.model.Ator;
import br.com.etec.guilherme.locadoraApi.repository.AtorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/atores")
public class AtorResource {

    @Autowired
    private AtorRepository atorRepository;

    @GetMapping("/todos")
    public List<Ator> listarTodosAtores(){
        return atorRepository.findAll(Sort.by("nomeator").ascending());
    }
}
