package com.lytw13.demo;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class RabbitmqEmailApplication {

    public static void main(String[] args) {
        SpringApplication.run(RabbitmqEmailApplication.class, args);
    }

}
