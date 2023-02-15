package br.com.etec.guilherme.locadoraApi.model;

import javax.persistence.*;

@Entity
@Table(name = "genero")
public class Genero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String descricao;
}
