package com.example.rabbitmqsender.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;
import java.util.function.Supplier;

@Configuration
public class MessageGenerator {
    Random random = new Random();

    @Bean
    Supplier<Message> generateMessage() {
        return () -> new Message("Hello from message sending service! Version " + random.nextInt(1, 100));
    }
}
