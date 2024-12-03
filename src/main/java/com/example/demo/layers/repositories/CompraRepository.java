package com.example.demo.layers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.layers.entities.Compra;

public interface CompraRepository extends JpaRepository<Compra,Long> {
    
}
