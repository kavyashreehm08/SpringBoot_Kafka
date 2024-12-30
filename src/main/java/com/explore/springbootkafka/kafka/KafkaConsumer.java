package com.explore.springbootkafka.kafka;

import com.explore.springbootkafka.pojopayload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    private static final Logger LOGGER= LoggerFactory.getLogger(KafkaConsumer.class);
@KafkaListener(topics = "sampleTopic", groupId = "myGroup")
    public void consumeStringMessage(String message){
LOGGER.info(String.format("Message received -> %s", message));
    }

    @KafkaListener(topics = "jasonDataTopic", groupId = "myGroup")
    public void consumeUserMessage(User user){
        LOGGER.info(String.format("Message received -> %s", user));
    }
}
