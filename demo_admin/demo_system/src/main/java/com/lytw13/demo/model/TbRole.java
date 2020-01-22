package com.lytw13.demo.model;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class TbRole {

    private Integer id;
    private String name;
    private Integer sequence;
    private Integer status;

    private List<TbUser> tbUserList;
    private List<TbMenu> tbMenuList;
}
