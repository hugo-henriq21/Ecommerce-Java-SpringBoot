package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.example.demo.layers.entities.Produto;
import com.example.demo.layers.repositories.ProdutoRepository;

import jakarta.transaction.Transactional;

@SpringBootTest
@ActiveProfiles("test")
public class ProdutoTestes {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Test
	@Transactional
    public void testeInserirProduto() {
        Produto produto = new Produto();
        produto.setNome("Notebook");
        produto.setDescricao("Notebook Asus 3,0GHz 500GB SSD, 16GB RAM");

        produtoRepository.save(produto);

         // Verifique se o produto foi realmente salvo
    Produto produtoSalvo = produtoRepository.findById(produto.getId()).orElse(null);
    assertNotNull(produtoSalvo);
    assertEquals("Notebook", produtoSalvo.getNome());
    }
}
