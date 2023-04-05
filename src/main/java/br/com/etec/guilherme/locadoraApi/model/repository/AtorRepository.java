package br.com.etec.guilherme.locadoraApi.model.repository;

import br.com.etec.guilherme.locadoraApi.model.Ator;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Entity;

@Entity
public interface AtorRepository extends JpaRepository<Ator, Integer> {
}
