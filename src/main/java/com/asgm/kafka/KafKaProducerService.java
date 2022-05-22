package com.asgm.kafka;

import com.asgm.kafka.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafKaProducerService {
    private static final Logger logger =
            LoggerFactory.getLogger(KafKaProducerService.class);

    @Value("${kafka.topic_name}")
    private String topic;

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    private KafkaTemplate<String, User> userKafkaTemplate;

    public void sendMessage(String message)
    {
        logger.info(String.format("Message sent -> %s", message));
        this.kafkaTemplate.send(topic, message);
    }

    public void sendMessage(User user)
    {
        logger.info(String.format("Message sent -> %s", user.toString()));
        this.userKafkaTemplate.send(topic, user);
    }
}
