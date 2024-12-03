package com.example.demo.layers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.layers.entities.Cliente;

public interface ClientRepository extends JpaRepository<Cliente, Long> {
    
}
