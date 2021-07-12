package com.minhaLojadeGames.services;



import java.nio.charset.Charset;
import java.util.Optional;

import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.minhaLojadeGames.models.Cliente;
import com.minhaLojadeGames.models.dtos.ClienteDTO;
import com.minhaLojadeGames.repositories.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	public Optional<Object> cadastrarCliente(Cliente novoCliente) {
		return clienteRepository.findByLogin(novoCliente.getLogin()).map(clienteExistente -> {
			return Optional.empty();
		}).orElseGet(() -> {
			BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
			String senhaCriptografada = encoder.encode(novoCliente.getSenha());
			novoCliente.setSenha(senhaCriptografada);
			return Optional.ofNullable(clienteRepository.save(novoCliente));
		});
	}

	public Optional<?> pegarCredenciais(ClienteDTO clienteDto) {
			return clienteRepository.findByLogin(clienteDto.getLogin()).map(usuarioExistente -> {
				BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
				if(encoder.matches(clienteDto.getSenha(), usuarioExistente.getSenha())) {
					String estruturaBasic = clienteDto.getLogin() + ":" + clienteDto.getSenha();
					byte[] autorizacaoBase64 = Base64.encodeBase64(estruturaBasic.getBytes(Charset.forName("US-ASCII")));;
					String autorizacaoHeader = "Basic " + new String(autorizacaoBase64);
					
					clienteDto.setToken(autorizacaoHeader);
					clienteDto.setLogin(usuarioExistente.getLogin());
					clienteDto.setSenha(usuarioExistente.getSenha());
					
					return Optional.ofNullable(clienteDto);
				}
				else {
					return Optional.empty();
				}
				
			}).orElse(Optional.empty());		
					
					
	}

}
