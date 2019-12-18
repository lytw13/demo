package com.lytw13.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class TbUser {
    private Integer id;
    private String name;
    private String password;
    private Integer sex;
    private String icon;
    private String phone;
    private String email;
    private Integer status;
    private Date createDate;
}
