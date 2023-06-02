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

    public ResumoFilme(Long id, String nomefilme, String descricao, String nomeator) {
        this.id = id;
        this.nomefilme = nomefilme;
        this.descricao = descricao;
        this.nomeator = nomeator;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomefilme() {
        return nomefilme;
    }

    public void setNomefilme(String nomefilme) {
        this.nomefilme = nomefilme;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNomeator() {
        return nomeator;
    }

    public void setNomeator(String nomeator) {
        this.nomeator = nomeator;
    }
}
