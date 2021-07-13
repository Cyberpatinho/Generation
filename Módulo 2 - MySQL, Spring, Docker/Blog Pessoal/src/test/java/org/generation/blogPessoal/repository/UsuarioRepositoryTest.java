package org.generation.blogPessoal.repository;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.generation.blogPessoal.model.Usuario;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class UsuarioRepositoryTest {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	private Usuario u1, u2;
	
	@BeforeEach
	public void start() {
		u1 = new Usuario("admin", "admin", "admin");
		u2 = new Usuario("root1", "root1", "root1");
		usuarioRepository.saveAll(Arrays.asList(u1, u2));
	}
	
	
	@Test
	void testValidaNumeroDeInsercoes() {
		assertTrue(usuarioRepository.findAll().size() == 2);
	}
	
	@AfterEach
	public void end() {
		usuarioRepository.deleteAll();
	}

}
