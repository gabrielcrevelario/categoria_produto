package com.example.testezao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "categoria")
public class Categoria implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long id;
	@Size(max = 30)
	public String nome;
	@ManyToMany(mappedBy="categorias")
	private List<Produto> produtos = new ArrayList<Produto>();
	
	public long getId() {
		return id;
	}
  public List<Produto> getProdutos() {
	return produtos;
  }
  public void setProdutos(List<Produto> produtos) {
	  this.produtos = produtos;
  }
	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Categoria(long id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public Categoria() {
	}

}
