package com.online.college.enums;

import lombok.Getter;

/**
 * @Author:cys
 * @Date:Created in 15:49 2017/12/13
 */
@Getter
public enum WeightEnum {
    DEFULT(0,"默认"),

    ;
    private Integer code;
    private String msg;

    WeightEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
