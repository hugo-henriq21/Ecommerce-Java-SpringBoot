package com.example.demo.layers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.layers.entities.CompraProduto;

public interface CompraProdutoRepository extends JpaRepository<CompraProduto, Long>{
    
}
