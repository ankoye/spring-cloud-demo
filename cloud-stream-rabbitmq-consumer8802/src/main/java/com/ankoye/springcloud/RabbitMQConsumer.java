package com.ankoye.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RabbitMQConsumer {
    public static void main(String[] args) {
        SpringApplication.run(RabbitMQConsumer.class, args);
    }
}
