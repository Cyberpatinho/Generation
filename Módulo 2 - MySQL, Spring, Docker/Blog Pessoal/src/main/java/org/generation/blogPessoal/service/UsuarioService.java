package org.generation.blogPessoal.service;

import java.nio.charset.Charset;
import java.util.Optional;

import org.apache.tomcat.util.codec.binary.Base64;
import org.generation.blogPessoal.model.UserLogin;
import org.generation.blogPessoal.model.Usuario;
import org.generation.blogPessoal.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {


	@Autowired
	private UsuarioRepository usuarioRepository;

	public Optional<Object> cadastrar(Usuario novoUsuario) {
		return usuarioRepository.findByLogin(novoUsuario.getLogin()).map(usuarioExistente -> {
			return Optional.empty();
		}).orElseGet(() -> {
			BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
			String senhaCriptografada = encoder.encode(novoUsuario.getSenha());
			novoUsuario.setSenha(senhaCriptografada);
			return Optional.ofNullable(usuarioRepository.save(novoUsuario));
		});
	}

	public Optional<?> logar(UserLogin usuarioDto) {
			return usuarioRepository.findByLogin(usuarioDto.getLogin()).map(usuarioExistente -> {
				BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
				if(encoder.matches(usuarioDto.getSenha(), usuarioExistente.getSenha())) {
					String estruturaBasic = usuarioDto.getLogin() + ":" + usuarioDto.getSenha();
					byte[] autorizacaoBase64 = Base64.encodeBase64(estruturaBasic.getBytes(Charset.forName("US-ASCII")));;
					String autorizacaoHeader = "Basic " + new String(autorizacaoBase64);
					
					usuarioDto.setToken(autorizacaoHeader);
					usuarioDto.setLogin(usuarioExistente.getLogin());
					usuarioDto.setSenha(usuarioExistente.getSenha());
					
					return Optional.ofNullable(usuarioDto);
				}
				else {
					return Optional.empty();
				}
				
			}).orElse(Optional.empty());		
					
					
	}

}
