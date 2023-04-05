package br.com.etec.guilherme.locadoraApi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "genero")
public class Genero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        private String descricao;

        @JsonIgnore
        @OneToMany(mappedBy = "genero")
        private List <Filme> filmesgenero = new ArrayList<>();


    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public List<Filme> getFilmesgenero() {
        return filmesgenero;
    }
    public void setFilmesgenero(List<Filme> filmesgenero) {
        this.filmesgenero = filmesgenero;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Genero genero = (Genero) o;
        return id.equals(genero.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
