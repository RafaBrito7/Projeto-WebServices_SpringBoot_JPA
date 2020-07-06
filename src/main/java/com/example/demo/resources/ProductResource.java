package com.example.demo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Product;
import com.example.demo.services.ProductService;

/*
 * Classe responsável por disponibilizar os recursos web para a Classe Product
 */

@RestController // Significa que essa classe é um recurso web que é implementado por um controlador rest
@RequestMapping(value = "/products") // Caminho do recurso
public class ProductResource {
	
	//Injetando dependência
	@Autowired
	private ProductService service;
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll(){ // Método que retorna respostas de requisição Web
		List<Product> list = service.findAll();
		return ResponseEntity.ok().body(list); // Retorna a resposta com um "corpo" que passamos por parâmetro
	}
	
	@GetMapping(value = "/{id}") // Para falar que a url vai aceitar um parâmetro, no caso o ID dentro da url
	public ResponseEntity<Product> findById(@PathVariable Long id){ // Essa anotation serve para que o spring receba o id
		Product obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}
