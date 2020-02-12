package com.example.kafkahelloworld.engine;

import com.example.kafkahelloworldproducer.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class Consumer {
    private final Logger logger = LoggerFactory.getLogger(Consumer.class);

    @KafkaListener(topics = "users", groupId = "group_id_one")
    public void consume(User user) throws IOException {
//        System.out.println("User::"+user);
        logger.info("user"+user.toString());
    }
}
