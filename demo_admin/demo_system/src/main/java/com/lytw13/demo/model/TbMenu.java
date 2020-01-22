package com.lytw13.demo.model;

import lombok.*;

import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class TbMenu implements Serializable {
    private Integer id;
    private String name;
    private String icon;
    private String url;
    private String permission;
    private Integer status;
    private Integer pid;
    private String type;

    private List<TbRole> roleList;
}
