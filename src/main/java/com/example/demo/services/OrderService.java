package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Order;
import com.example.demo.repositories.OrderRepository;

@Service //Registra a classe como dependência no Spring (Component ou Service ou Repository, escolher o mais adequado pra classe)
public class OrderService {

	// Injetando Dependência do OrderRepository
	@Autowired
	private OrderRepository repository;
	
	// Retornar todos os usuários do banco de dados
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	//Recuperando Usuário por ID
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id); // o findById retorna um Optional
		return obj.get();
	}
}
