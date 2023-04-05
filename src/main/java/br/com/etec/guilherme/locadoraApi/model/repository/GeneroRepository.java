package br.com.etec.guilherme.locadoraApi.model.repository;

import br.com.etec.guilherme.locadoraApi.model.Genero;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface GeneroRepository extends JpaRepository<Genero, Integer>{
}
