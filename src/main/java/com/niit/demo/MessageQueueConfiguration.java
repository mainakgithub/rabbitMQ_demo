package com.niit.demo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.amqp.core.Queue;
@Configuration
@Profile("Hello World")
public class MessageQueueConfiguration {
    @Bean
    public Queue queueHello(){
        return new Queue("MAINAK");
    }
    @Profile("sender")
    @Bean
    public MessageSender sender(){
        return new MessageSender();

    }
    @Profile("reciever")
    @Bean
    public MessageReceiver receiver(){
        return new MessageReceiver();
    }
}
