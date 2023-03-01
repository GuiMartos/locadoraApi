package br.com.etec.guilherme.locadoraApi.model;

import javax.persistence.*;

@Entity
@Table(name="ator")
public class Ator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
            private Integer id;

            private String nome;

}
