package br.com.etec.guilherme.locadoraApi.repository.projections;

import br.com.etec.guilherme.locadoraApi.model.Ator;
import br.com.etec.guilherme.locadoraApi.model.Genero;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class ResumoFilme {

    private Long id;

    private String nomefilme;

    private String descricao; // nome do genero

    private String nomeator; 

}