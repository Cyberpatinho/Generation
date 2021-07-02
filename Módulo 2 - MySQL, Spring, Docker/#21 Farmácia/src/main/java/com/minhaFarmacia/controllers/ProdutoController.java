package com.minhaFarmacia.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.minhaFarmacia.models.Produto;
import com.minhaFarmacia.repositories.ProdutoRepository;

@RestController
@RequestMapping("/Produto")
public class ProdutoController {

	@Autowired
	ProdutoRepository repo;

	@GetMapping("/all")
	ResponseEntity<List<Produto>> findAllProduto() {
		return ResponseEntity.status(200).body(repo.findAll());
	}

	@GetMapping("/{id}")
	ResponseEntity<Produto> findByIdProduto(@PathVariable long id) {
		Optional<Produto> ret = repo.findById(id);
		return ret.isPresent() ? ResponseEntity.status(200).body(ret.get()) : ResponseEntity.status(404).build();
	}

	@GetMapping("/Titulo/{titulo}")
	ResponseEntity<Produto> findByNomeProduto(@PathVariable String titulo) {
		Optional<Produto> ret = repo.findByNomeProdutoIgnoreCase(titulo);
		return ret.isPresent() ? ResponseEntity.status(200).body(ret.get()) : ResponseEntity.status(404).build();
	}

	@PostMapping
	ResponseEntity<Produto> postProduto(@Valid @RequestBody Produto produto) {
		return ResponseEntity.status(201).body(repo.save(produto));
	}

	@PutMapping
	ResponseEntity<Produto> updateProduto(@Valid @RequestBody Produto produto) {
		return ResponseEntity.status(200).body(repo.save(produto));
	}

	@DeleteMapping("/{id}")
	public void deleteProduto(@PathVariable long id) {
		repo.deleteById(id);
	}

}
