package com.minhaLojadeGames.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.minhaLojadeGames.models.Cliente;
import com.minhaLojadeGames.repositories.ClienteRepository;

@Service 
public class UserDetailsServiceImplement implements UserDetailsService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Optional<Cliente> clienteExistente = clienteRepository.findByLogin(username);
		
		if(clienteExistente.isPresent()) {
			return new UserDetailsImplement(clienteExistente.get());
		}
		else {
			throw new UsernameNotFoundException(username + " não existe!");
		}
		
	}

}
