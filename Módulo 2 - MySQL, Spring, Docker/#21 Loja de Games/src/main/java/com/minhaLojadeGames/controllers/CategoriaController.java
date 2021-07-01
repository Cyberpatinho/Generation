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

import com.minhaLojadeGames.models.Categoria;
import com.minhaLojadeGames.repositories.CategoriaRepository;

@RestController
@RequestMapping("/Categoria")
public class CategoriaController {

	@Autowired
	CategoriaRepository repo;

	@GetMapping("/all")
	ResponseEntity<List<Categoria>> findAllCategoria() {
		return ResponseEntity.status(200).body(repo.findAll());
	}

	@GetMapping("/{id}")
	ResponseEntity<Categoria> findByIDCategoria(@PathVariable long id) {
		return ResponseEntity.status(200).body(repo.findById(id).get());
	}

	@GetMapping("/descricao/{descricao}")
	ResponseEntity<List<Categoria>> findByDescricaoCategoria(@PathVariable String descricao) {
		return ResponseEntity.status(200).body(repo.findAllByDescricaoContainingIgnoreCase(descricao));
	}

	@PostMapping
	ResponseEntity<Categoria> postCategoria(@RequestBody Categoria categoria) {
		return ResponseEntity.status(201).body(repo.save(categoria));
	}

	@PutMapping
	ResponseEntity<Categoria> putCategoria(@RequestBody Categoria categoria) {
		return ResponseEntity.status(200).body(repo.save(categoria));
	}

	@DeleteMapping("/{id}")
	public void deleteCategoria(@PathVariable long id) {
		repo.deleteById(id);
	}

}
