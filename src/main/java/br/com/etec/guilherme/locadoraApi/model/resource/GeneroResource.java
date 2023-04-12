package br.com.etec.guilherme.locadoraApi.model.resource;


import br.com.etec.guilherme.locadoraApi.model.Genero;
import br.com.etec.guilherme.locadoraApi.model.repository.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("generos")
public class GeneroResource {

    @Autowired
    private GeneroRepository generoRepository;

    @GetMapping("/todos")
    public List<Genero> listarTodosGeneros(){
        return generoRepository.findAll();
    }
}
