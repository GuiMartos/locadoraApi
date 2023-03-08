package br.com.etec.guilherme.locadoraApi.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name="ator")
public class Ator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
            private Integer id;
            private String nome;

    @OneToMany(mappedBy = "ator")
        private List <Filme> filmesator = new ArrayList<>();


    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<Filme> getFilmesator() {
        return filmesator;
    }

    public void setFilmesator(List<Filme> filmesator) {
        this.filmesator = filmesator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ator ator = (Ator) o;
        return id.equals(ator.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
