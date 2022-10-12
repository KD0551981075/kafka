package com.microService.kafkaexample;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "AmigosCode1",
            groupId = "groupID 1"
    )
    void kafkaListener(String data)
    {
        System.out.println("Kafka Listener" +data + ":)");
    }

}
