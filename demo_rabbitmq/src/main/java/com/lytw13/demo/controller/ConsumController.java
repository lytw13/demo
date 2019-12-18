package com.lytw13.demo.controller;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RabbitListener
public class ConsumController {
    @Autowired
    RabbitTemplate rabbitTemplate;

    @GetMapping("receiveEmail1")
    public void receiveEmail1() {
        Message receive = rabbitTemplate.receive("demo.fanout");
        System.out.println(receive.toString());
    }
}
