package com.example.demo.layers.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.Date;
import java.util.List;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 255)
    private String nome;

    @Column(nullable = false, unique = true, length = 14)
    private String cpf;

    @Column(name = "data_nascimento", nullable = false)
    private Date dataNascimento;
    //Relação 1:N com Compra
    //OnetoMany: indica que o campo vai de 1 para muitos
    //mappedBy: está indicando que o campo cliente na entidade Compra
    ////É a chave estrangeira que referencia a coluna Cliente.
    
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Compra> compras;
    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public List<Compra> getCompras(){
        return compras;
    }

    public void setCompras(List<Compra> compras){
        this.compras = compras;
    }
}
