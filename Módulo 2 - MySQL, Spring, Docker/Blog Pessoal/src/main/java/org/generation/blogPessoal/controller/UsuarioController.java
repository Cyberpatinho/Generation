package org.generation.blogPessoal.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.generation.blogPessoal.model.UserLogin;
import org.generation.blogPessoal.model.Usuario;
import org.generation.blogPessoal.repository.UsuarioRepository;
import org.generation.blogPessoal.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping("/all")
	public List<Usuario> findAll(){
		return usuarioRepository.findAll();
	}
	
	@PostMapping("/cadastrar")
	public ResponseEntity<Object> cadastrar(@RequestBody Usuario usuario) {

		Optional<Object> novoUsuario = usuarioService.cadastrar(usuario);
		if (novoUsuario.isEmpty()) {
			return ResponseEntity.status(200).body("Usuário existente!");
		} else {
			return ResponseEntity.status(201).body("Usuário criado!");
		}

	}

	@PutMapping("/logar")
	public ResponseEntity<?> logar(@Valid @RequestBody UserLogin usuarioDto) {
		return usuarioService.logar(usuarioDto)
				.map(usuario -> ResponseEntity.ok(usuario))
				.orElse(ResponseEntity.badRequest().build());
	}


}
