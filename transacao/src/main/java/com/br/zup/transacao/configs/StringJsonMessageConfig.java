package com.br.zup.transacao.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.support.converter.StringJsonMessageConverter;

@Configuration
public class StringJsonMessageConfig {

    @Bean
    public StringJsonMessageConverter stringJsonMessageConverter(){
        return new StringJsonMessageConverter();
    }
}
