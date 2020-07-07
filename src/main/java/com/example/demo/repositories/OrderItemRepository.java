package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.OrderItem;

// @Repository não precisa nesse caso pq a Classe já extend de JPARepository que já possui o @Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}

