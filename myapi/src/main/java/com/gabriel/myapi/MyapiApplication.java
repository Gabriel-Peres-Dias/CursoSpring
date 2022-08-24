package com.gabriel.myapi;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gabriel.myapi.domain.Usuario;
import com.gabriel.myapi.repositories.UsuarioRepository;

@SpringBootApplication
public class MyapiApplication implements CommandLineRunner {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(MyapiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Usuario u1 = new Usuario(null, "Gabriel Peres", "bidus123", "123456");
		Usuario u2 = new Usuario(null, "Guilherme Peres", "suamaeminhactz", "123456");
		Usuario u3 = new Usuario(null, "Gabriela Peres", "gabi2004", "123456");
		
		usuarioRepository.saveAll(Arrays.asList(u1, u2, u3));
		
	}

}
