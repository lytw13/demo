package com.lytw13.demo.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class BaseResult {
    private Integer resultCode;
    private String resultMsg;
    private Object resultData;

}
