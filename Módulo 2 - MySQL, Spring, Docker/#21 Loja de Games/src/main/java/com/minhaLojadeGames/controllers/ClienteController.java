package com.minhaLojadeGames.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.minhaLojadeGames.models.Cliente;
import com.minhaLojadeGames.models.dtos.ClienteDTO;
import com.minhaLojadeGames.repositories.ClienteRepository;
import com.minhaLojadeGames.services.ClienteService;

@RestController
@RequestMapping("/Cliente")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;

	@Autowired
	private ClienteRepository clienteRepository;

	@GetMapping("/all")
	public List<Cliente> findAll() {
		return clienteRepository.findAll();
	}

	@PostMapping("/cadastrar")
	public ResponseEntity<Object> cadastrarUsuario(@RequestBody Cliente cliente) {

		Optional<Object> clienteCadastro = clienteService.cadastrarCliente(cliente);
		if (clienteCadastro.isEmpty()) {
			return ResponseEntity.status(200).body("Usuário existente!");
		} else {
			return ResponseEntity.status(201).body("Usuário criado!");
		}

	}

	@PutMapping("/credenciais")
	public ResponseEntity<?> pegarCredenciais(@Valid @RequestBody ClienteDTO clienteDto) {
		return clienteService.pegarCredenciais(clienteDto)
				.map(clienteCredenciado -> ResponseEntity.ok(clienteCredenciado))
				.orElse(ResponseEntity.badRequest().build());
	}

}
