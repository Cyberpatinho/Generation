package com.minhaFarmacia.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.minhaFarmacia.models.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	Optional<Produto> findByNomeProdutoIgnoreCase(String titulo);
	
}
