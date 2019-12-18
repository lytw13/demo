package com.lytw13.demo.controller;

import com.lytw13.demo.model.TbUser;
import com.lytw13.demo.service.UserService;
import com.lytw13.demo.util.MailUtil;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    RabbitTemplate rabbitTemplate;

    @PostMapping("save")
    public void save(@RequestBody TbUser user) {
        userService.save(user);
        rabbitTemplate.convertAndSend("email.direct","email.direct",user);
    }

}
