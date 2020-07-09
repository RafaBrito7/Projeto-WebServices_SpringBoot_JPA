package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;

@Service //Registra a classe como dependência no Spring (Component ou Service ou Repository, escolher o mais adequado pra classe)
public class UserService {

	// Injetando Dependência do UserRepository
	@Autowired
	private UserRepository repository;
	
	// Retornar todos os usuários do banco de dados
	public List<User> findAll(){
		return repository.findAll();
	}
	
	//Recuperando Usuário por ID
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id); // o findById retorna um Optional, indo até o banco de dados
		return obj.get();
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	public User update(Long id, User obj) {
		User entity = repository.getOne(id); // retorna um obj sem necessitar ir no banco de dados
		updateData(entity, obj);
		return repository.save(entity);
	}

	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}
}
