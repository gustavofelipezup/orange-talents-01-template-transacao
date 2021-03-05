package com.br.zup.transacao.transacao;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.br.zup.transacao.cartoes.Cartao;
import com.br.zup.transacao.estabelecimento.Estabelecimento;

@Entity
public class Transacao {
	
	@Id
	private String id;
	private BigDecimal valor;
	@ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
	private Estabelecimento estabelecimento;
	@ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
	private Cartao cartao;
	private LocalDateTime efetivadoEm;
	
	@Deprecated
	public Transacao() {
		
	}

	public Transacao(String id, BigDecimal valor, Estabelecimento estabelecimento, Cartao cartao,
			LocalDateTime efetivadoEm) {
		super();
		this.id = id;
		this.valor = valor;
		this.estabelecimento = estabelecimento;
		this.cartao = cartao;
		this.efetivadoEm = efetivadoEm;
	}

	public String getId() {
		return id;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public Estabelecimento getEstabelecimento() {
		return estabelecimento;
	}

	public Cartao getCartao() {
		return cartao;
	}

	public LocalDateTime getEfetivadoEm() {
		return efetivadoEm;
	}
	
	
}
