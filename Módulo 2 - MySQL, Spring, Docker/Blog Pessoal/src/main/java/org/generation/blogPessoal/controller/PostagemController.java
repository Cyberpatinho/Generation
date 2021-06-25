package org.generation.blogPessoal.controller;

import java.util.List;

import javax.sound.midi.SysexMessage;

import org.generation.blogPessoal.model.Postagem;
import org.generation.blogPessoal.repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/postagens")
public class PostagemController {
	
	@Autowired
	private PostagemRepository repository;
	
	@GetMapping
	public ResponseEntity<?> findAll(){
		return ResponseEntity.status(200).body(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> findById(@PathVariable Integer id) {
		return ResponseEntity.status(200).body(repository.findById(id));
	}
	
	@GetMapping("/titulo/{titulo}")
	public ResponseEntity<?> findByTitulo(@PathVariable String titulo){
		return ResponseEntity.status(200).body(repository.findAllByTituloContainingIgnoreCase(titulo));
	}
	
	@PostMapping
	public ResponseEntity<?> post(@RequestBody Postagem postagem){
		return ResponseEntity.status(201).body(repository.save(postagem));
	}
	
	@PutMapping
	public ResponseEntity<?> put(@RequestBody Postagem postagem){
		return ResponseEntity.status(200).body(repository.save(postagem));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
	
	
}
