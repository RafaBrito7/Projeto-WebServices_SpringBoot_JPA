package com.example.demo.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.User;

/*
 * Classe responsável por disponibilizar os recursos web para a Classe User
 */

@RestController // Significa que essa classe é um recurso web que é implementado por um controlador rest
@RequestMapping(value = "/users") // Caminho do recurso
public class UserResource {
	
	@GetMapping
	public  ResponseEntity<User> findAll(){ // Método que retorna respostas de requisição Web
		User u = new User(1L, "Maria", "maria@gmail.com", "2222112", "12345");
		return ResponseEntity.ok().body(u); // Retorna a resposta com um "corpo" que passamos por parâmetro
	}

}
