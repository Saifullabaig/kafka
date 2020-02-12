package com.example.kafkahelloworldconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.kafka.KafkaAutoConfiguration;

@SpringBootApplication
public class KafkaHelloWorldConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaHelloWorldConsumerApplication.class, args);
	}

}
