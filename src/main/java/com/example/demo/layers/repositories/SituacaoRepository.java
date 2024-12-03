package com.example.demo.layers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.layers.entities.Situacao;

public interface SituacaoRepository extends JpaRepository<Situacao, Long> {
    
}
