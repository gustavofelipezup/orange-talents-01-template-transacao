package com.br.zup.transacao.transacao;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Optional;

import com.br.zup.transacao.cartoes.Cartao;
import com.br.zup.transacao.estabelecimento.Estabelecimento;
import com.br.zup.transacao.repositories.CartaoRepository;
import com.br.zup.transacao.repositories.EstabelecimentoRepository;

public class TransacaoEvent {

	private String id;
	private BigDecimal valor;
	private Estabelecimento estabelecimento;
	private Cartao cartao;
	private LocalDateTime efetivadoEm;
	
	
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
	
	
	public Transacao gerar(CartaoRepository cartaoRepository, EstabelecimentoRepository estabelecimentoRepository) {
		Optional<Cartao> possivelCartao = cartaoRepository.findByNumeroCartao(cartao.getId().toString());
		
		Cartao cartao = possivelCartao.isPresent() ? possivelCartao.get() : new Cartao(this.cartao.getId().toString(), this.cartao.getEmail());
		
		var origem = estabelecimentoRepository.findByNome(estabelecimento.getNome());
		
		Estabelecimento estabelecimento = origem.isPresent() ? origem.get() : new Estabelecimento(this.estabelecimento.getNome(), this.estabelecimento.getCidade(), this.estabelecimento.getEndereco());
		
		return new Transacao(id, valor, estabelecimento, cartao, this.efetivadoEm);
	}
	
	@Override
    public String toString() {
        return "EventoTransacao{" +
                "id='" + id + '\'' +
                ", valor=" + valor +
                ", estabelecimento=" + estabelecimento +
                ", cartao=" + cartao +
                ", efetivadaEm=" + efetivadoEm +
                '}';
    }
}
