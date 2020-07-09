package com.example.demo.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.entities.User;
import com.example.demo.services.UserService;

/*
 * Classe responsável por disponibilizar os recursos web para a Classe User
 */

@RestController // Significa que essa classe é um recurso web que é implementado por um controlador rest
@RequestMapping(value = "/users") // Caminho do recurso
public class UserResource {
	
	//Injetando dependência
	@Autowired
	private UserService service;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){ // Método que retorna respostas de requisição Web
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list); // Retorna a resposta com um "corpo" que passamos por parâmetro
	}
	
	@GetMapping(value = "/{id}") // Para falar que a url vai aceitar um parâmetro, no caso o ID dentro da url
	public ResponseEntity<User> findById(@PathVariable Long id){ // Essa anotation serve para que o spring receba o id
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@PostMapping // Inserindo dados com o Rest vindo do Postman
	public ResponseEntity<User> insert(@RequestBody User obj){ // RequestBody o JSON que chegou no webservice vai ser convertido para um objeto java, ou seja, ele deixa de ser uma string (json) para ser um objeto java (classe)
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri(); // Necessário para o http uri pro código 201
		return ResponseEntity.created(uri).body(obj); // Trazendo o código 201 para inserção de um user 
	}
	
	@DeleteMapping (value = "/{id}") // Deletando dados com o Rest vindo do Postman
	public ResponseEntity<Void> delete(@PathVariable Long id){
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping(value = "/{id}") // Atualizando dados com o Rest vindo do Postman
	public ResponseEntity<User> update(@PathVariable Long id, @RequestBody User obj ){
		obj = service.update(id, obj);
		return ResponseEntity.ok().body(obj);
	}

}
