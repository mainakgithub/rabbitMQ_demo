package com.niit.demo;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.amqp.core.Queue;

public class MessageSender {

    @Autowired
    RabbitTemplate rabbitTemplate;

    @Autowired

    private Queue queue;
    @Scheduled(fixedDelay = 1000, initialDelay = 500)
    public void send(){
        String message = "Hello Mainak";
        this.rabbitTemplate.convertAndSend(queue.getName(),message);
        System.out.println("[x] Sent "+message);
    }
}
