package com.lytw13.demo.adapter;

import com.alibaba.fastjson.JSONObject;
import com.lytw13.demo.model.TbUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;


@Component
public class ReceiveMessage {

    @Autowired
    JavaMailSender javaMailSender;
    @Autowired
    MessageAdapter messageAdapter;
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RabbitListener(queues="email.direct")
    public void receiveMess(String json) {
        logger.info("#####消息服务平台接受消息内容:{}#####", json);
        JSONObject root = JSONObject.parseObject(json);
        JSONObject header = root.getJSONObject("header");
        JSONObject main = root.getJSONObject("main");
        String type = header.getString("type");
        TbUser tbUser = JSONObject.toJavaObject(main, TbUser.class);
        if(type.equalsIgnoreCase("email")) {
            messageAdapter.sendMessage(tbUser);
        }
    }
}
