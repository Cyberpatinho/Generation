package org.generation.blogPessoal.model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;


@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class UsuarioTest {
	
	public Usuario usuario;
	
	@Autowired
	private ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
	Validator validador = factory.getValidator();

	@BeforeEach 
	public void start() {
		usuario = new Usuario("admin", "admin", null);
	}
	
	@Test
	void testValidaAtributosNaoRetornaErro() {
		Set<ConstraintViolation<Usuario>> validacao = validador.validate(usuario);
		assertTrue(validacao.isEmpty());
	}


}
