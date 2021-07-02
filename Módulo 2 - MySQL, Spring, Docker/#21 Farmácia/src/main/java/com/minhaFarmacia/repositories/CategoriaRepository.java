package com.minhaFarmacia.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.minhaFarmacia.models.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	Optional<Categoria> findByDescricaoCategoriaIgnoreCase(String descricao);

}
