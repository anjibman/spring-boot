package com.asgm.kafka;

import com.asgm.kafka.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaProducerController {
    private final KafKaProducerService producerService;

    @Autowired
    public KafkaProducerController(KafKaProducerService producerService)
    {
        this.producerService = producerService;
    }

    @PostMapping(value = "/publish")
    public void sendMessageToKafkaTopic(@RequestParam("message") String message)
    {
        this.producerService.sendMessage(message);
    }

    @PostMapping(value = "/user")
    public void sendMessageToKafkaTopic(@RequestBody User user) {
        this.producerService.sendMessage(user);
    }
}
