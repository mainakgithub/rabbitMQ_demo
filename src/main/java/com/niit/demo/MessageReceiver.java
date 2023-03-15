package com.niit.demo;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

@RabbitListener(queues = "MAINAK")
public class MessageReceiver {

    @RabbitHandler
    public void receiver(String message)
    {
        System.out.println("[X] received "+ message);
    }
}
