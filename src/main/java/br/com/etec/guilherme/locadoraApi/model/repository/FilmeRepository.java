package br.com.etec.guilherme.locadoraApi.model.repository;


import br.com.etec.guilherme.locadoraApi.model.Filme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmeRepository extends JpaRepository<Filme, Long> {
}
