package com.lytw13.demo.controller;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class PublicController {
    @Autowired
    RabbitTemplate rabbitTemplate;
    @GetMapping("sendEmail1")
    public String sendEmail1() {
        rabbitTemplate.convertAndSend("demo.fanout","","welcome to regist lytw13'blog!");
        return "success";
    }
    @GetMapping("sendEmail2")
    public String sendEmail2() {
        rabbitTemplate.convertAndSend("demo.direct","lytw13","welcome to regist lytw13'blog!");
        return "success";
    }
    @GetMapping("sendEmail3")
    public String sendEmail3() {
        rabbitTemplate.convertAndSend("demo.topic","lytw13.hello","welcome to regist lytw13'blog!");
        return "success";
    }
}
