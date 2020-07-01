package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Category;
import com.example.demo.repositories.CategoryRepository;

@Service //Registra a classe como dependência no Spring (Component ou Service ou Repository, escolher o mais adequado pra classe)
public class CategoryService {

	// Injetando Dependência do CategoryRepository
	@Autowired
	private CategoryRepository repository;
	
	// Retornar todos os usuários do banco de dados
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	//Recuperando Usuário por ID
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id); // o findById retorna um Optional
		return obj.get();
	}
}
