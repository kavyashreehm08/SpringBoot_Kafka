package com.explore.springbootkafka.controller;

import com.explore.springbootkafka.kafka.JasonKafkaProducer;
import com.explore.springbootkafka.pojopayload.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/kafka")
public class JasonMessageController {

    private JasonKafkaProducer jasonKafkaProducer;

    public JasonMessageController(JasonKafkaProducer jasonKafkaProducer) {
        this.jasonKafkaProducer = jasonKafkaProducer;
    }
//http:localhost:8080/api/v1/kafka/jason/message/endpoint
    @PostMapping("/usage")
    public ResponseEntity<String> publish(@RequestBody User user){
        jasonKafkaProducer.sendMessage(user);
        return ResponseEntity.ok("Jason Message Sent to Kafka Topic");

    }
}
