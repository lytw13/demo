package com.lytw13.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyWebConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("loginPage").setViewName("login");
        registry.addViewController("registPage").setViewName("regist");
        registry.addViewController("/user/listPage").setViewName("user/userList");
        registry.addViewController("/menu/listPage").setViewName("menu/menuList");
        registry.addViewController("/role/listPage").setViewName("role/roleList");
        registry.addViewController("/role/addPage").setViewName("role/roleAddForm");
        registry.addViewController("/role/modifyPage").setViewName("role/roleModifyForm");
        registry.addViewController("/notice/listPage").setViewName("notice/noticeList");
        registry.addViewController("/notice/addPage").setViewName("notice/noticeAddForm");
        registry.addViewController("/notice/modifyPage").setViewName("notice/noticeModifyForm");
        //registry.addViewController("/index").setViewName("index");
    }
}
