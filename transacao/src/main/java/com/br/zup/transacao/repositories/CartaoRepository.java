package com.br.zup.transacao.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.zup.transacao.cartoes.Cartao;

@Repository
public interface CartaoRepository extends JpaRepository<Cartao, Long>{

	Optional<Cartao> findByNumeroCartao(String id);

}
