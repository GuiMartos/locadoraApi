package br.com.etec.guilherme.locadoraApi.repository;

import br.com.etec.guilherme.locadoraApi.model.Genero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneroRepository extends JpaRepository<Genero, Integer> {
}
