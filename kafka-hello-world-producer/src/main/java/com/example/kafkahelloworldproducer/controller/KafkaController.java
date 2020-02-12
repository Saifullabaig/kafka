package com.example.kafkahelloworldproducer.controller;

import com.example.kafkahelloworldproducer.engine.Producer;
import com.example.kafkahelloworldproducer.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {

    private final Producer producer;

    public KafkaController(Producer producer) {
        this.producer = producer;
    }

    @PostMapping("/publish")
    public User sendMessageToKafkaTopic(@RequestBody User user){
        System.out.println("USer ::"+user);
        this.producer.sendMessage(user);
        return user;
    }
}
