package br.com.mangatic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import br.com.mangatic.model.Mangas;

public interface CRUD extends JpaRepository<Mangas, Long> {

}
