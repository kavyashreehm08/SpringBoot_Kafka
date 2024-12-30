package com.explore.springbootkafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.KafkaAdmin;

import java.util.HashMap;
import java.util.Map;

//with this annotation,this class acts as a spring config class
@Configuration
public class KafkaTopicConfig {

    @Bean
   public NewTopic sampleTopic(){
       return TopicBuilder.name("sampleTopic")
               .build();
   }

   @Bean
   public NewTopic jasonDataTopic(){
        return TopicBuilder.name("jasonDataTopic").build();
   }

}
