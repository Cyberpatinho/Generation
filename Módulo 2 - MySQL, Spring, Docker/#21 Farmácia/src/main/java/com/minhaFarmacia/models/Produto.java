package com.minhaFarmacia.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"idProduto", "categorias"})
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idProduto;

	@NotNull(message = "Insira um nome para o produto!")
	@Size(min = 5, max = 50)
	private String nomeProduto;

	@NotNull(message = "Insira um preço para o produto!")
	private double preco;

	@ManyToMany
	@JoinTable(name = "Produto_Categoria", joinColumns = @JoinColumn(name = "produtoId"), inverseJoinColumns = @JoinColumn(name = "categoriaId"))
	List<Categoria> categorias = new ArrayList<>();

	public long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(long idProduto) {
		this.idProduto = idProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public List<Categoria> getCategoria() {
		return categorias;
	}

	public void setCategoria(List<Categoria> categoria) {
		this.categorias = categoria;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
