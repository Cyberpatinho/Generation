package com.minhaLojadeGames.controllers;

import java.util.List;

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

import com.minhaLojadeGames.models.Produto;
import com.minhaLojadeGames.repositories.ProdutoRepository;

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
	ResponseEntity<Produto> findByIDProduto(@PathVariable long id) {
		return ResponseEntity.status(200).body(repo.findById(id).get());
	}

	@GetMapping("/titulo/{titulo}")
	ResponseEntity<Produto> findByDescricaoTitulo(@PathVariable String titulo) {
		return ResponseEntity.status(200).body(repo.findByTituloIgnoreCase(titulo));
	}

	@PostMapping
	ResponseEntity<Produto> postProduto(@RequestBody Produto produto) {
		return ResponseEntity.status(201).body(repo.save(produto));
	}

	@PutMapping
	ResponseEntity<Produto> putProduto(@RequestBody Produto produto) {
		return ResponseEntity.status(200).body(repo.save(produto));
	}

	@DeleteMapping("/{id}")
	public void deleteProduto(@PathVariable long id) {
		repo.deleteById(id);
	}

}
