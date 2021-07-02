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

import com.minhaFarmacia.models.Categoria;
import com.minhaFarmacia.models.Produto;
import com.minhaFarmacia.repositories.CategoriaRepository;
import com.minhaFarmacia.repositories.ProdutoRepository;
import com.minhaFarmacia.services.CategoriaService;

@RestController
@RequestMapping(value="/Categoria")
public class CategoriaController {
	
	@Autowired
	CategoriaRepository categoriaRepository;
	
	@Autowired
	ProdutoRepository produtoRepository;
	
	@Autowired 
	CategoriaService categoriaService;
	
	@GetMapping("/all")
	public ResponseEntity<List<Categoria>> findAllCategoria(){
		return ResponseEntity.status(200).body(categoriaRepository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Categoria> findByIdCategoria(@PathVariable long id){
		Optional<Categoria> ret = categoriaRepository.findById(id);
		return ret.isPresent()? ResponseEntity.status(200).body(ret.get()) : ResponseEntity.status(404).build();
	}
	
	@GetMapping("/Descricao/{descricao}")
	public ResponseEntity<Categoria> findByDescricaoCategoria(@PathVariable String descricao){
		Optional<Categoria> ret = categoriaRepository.findByDescricaoCategoriaIgnoreCase(descricao);
		return ret.isPresent()? ResponseEntity.status(200).body(ret.get()) : ResponseEntity.status(404).build();
	}
	
	@PostMapping
	public ResponseEntity<Categoria> postCategoria(@Valid @RequestBody Categoria categoria){
		return ResponseEntity.status(201).body(categoriaRepository.save(categoria));
	}
	
	/*
	@PostMapping("/adicionar/{idCategoria}")
	public void addProduct(@PathVariable long idCategoria, @Valid @RequestBody Produto produto) {
		categoriaService.addProduct(idCategoria, produtoRepository.save(produto));
		return;
	}*/
	
	@PutMapping
	ResponseEntity<Categoria> updateCategoria(@Valid @RequestBody Categoria categoria){
		return ResponseEntity.status(200).body(categoriaRepository.save(categoria));
	}
	
	@DeleteMapping("/{id}")
	public void deleteCategoria(@PathVariable long id) {
		categoriaRepository.deleteById(id);
		return;
	}

}
