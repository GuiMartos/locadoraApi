package br.com.etec.guilherme.locadoraApi.model;

import javax.persistence.*;

@Entity
@Table (name = "filme")
public class Filme {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
        private Long id;

        private String nomefilme;

        @ManyToOne
        @JoinColumn(name="idgenero")
        private Genero genero;
}
