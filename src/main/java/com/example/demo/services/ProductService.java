package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Product;
import com.example.demo.repositories.ProductRepository;

@Service //Registra a classe como dependência no Spring (Component ou Service ou Repository, escolher o mais adequado pra classe)
public class ProductService {

	// Injetando Dependência do ProductRepository
	@Autowired
	private ProductRepository repository;
	
	// Retornar todos os usuários do banco de dados
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	//Recuperando Usuário por ID
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id); // o findById retorna um Optional
		return obj.get();
	}
}
