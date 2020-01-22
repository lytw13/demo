package com.lytw13.demo.model;

import lombok.*;

import java.io.Serializable;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class TbUser implements Serializable {
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
