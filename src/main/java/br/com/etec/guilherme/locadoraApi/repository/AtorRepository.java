package br.com.etec.guilherme.locadoraApi.repository;

import br.com.etec.guilherme.locadoraApi.model.Ator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtorRepository extends JpaRepository<Ator,Integer> {
}
