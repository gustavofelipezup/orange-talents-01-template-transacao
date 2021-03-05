package com.br.zup.transacao.estabelecimento;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Estabelecimento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String endereco;
	private String cidade;
	
	@Deprecated
	public Estabelecimento() {
		
	}
	
	
	public Estabelecimento(String nome, String endereco, String cidade) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.cidade = cidade;
	}
	
	
	public Long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public String getCidade() {
		return cidade;
	}
	
	
}
