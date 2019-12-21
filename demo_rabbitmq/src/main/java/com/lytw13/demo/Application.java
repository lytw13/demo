package com.lytw13.demo;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit  //开启rabbit
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
