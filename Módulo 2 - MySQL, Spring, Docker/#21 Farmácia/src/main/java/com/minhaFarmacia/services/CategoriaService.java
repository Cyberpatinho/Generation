package com.minhaFarmacia.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.minhaFarmacia.models.Categoria;
import com.minhaFarmacia.models.Produto;
import com.minhaFarmacia.repositories.CategoriaRepository;
import com.minhaFarmacia.repositories.ProdutoRepository;

@Service
public class CategoriaService {
	
	
	ProdutoRepository produtoRepository;
	CategoriaRepository categoriaRepository;
	
	public void addProduct(long idCategoria, Produto produto) {
		Optional<Categoria> categoria = categoriaRepository.findById(idCategoria);
		categoria.get().getProdutos().add(produto);
		return;
	}
	
}
