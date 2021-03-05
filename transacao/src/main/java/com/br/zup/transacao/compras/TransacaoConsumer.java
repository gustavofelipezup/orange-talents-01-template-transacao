package com.br.zup.transacao.compras;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class TransacaoConsumer {

	@KafkaListener(topics = "${transaction.topic}", groupId = "${spring.kafka.consumer.group-id}")
	public void ouvir() {
		
	}
}
