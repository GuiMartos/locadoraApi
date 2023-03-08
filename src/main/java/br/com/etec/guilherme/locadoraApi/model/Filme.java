package br.com.etec.guilherme.locadoraApi.model;

import javax.persistence.*;
import java.util.Objects;

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

        @ManyToOne
        @JoinColumn(name = "idator")
        private Ator ator;

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
    public Genero getGenero() {
        return genero;
    }
    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    public Ator getAtor() {
        return ator;
    }
    public void setAtor(Ator ator) {
        this.ator = ator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Filme filme = (Filme) o;
        return id.equals(filme.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
