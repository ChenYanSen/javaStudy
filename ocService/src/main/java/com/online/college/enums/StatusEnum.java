package com.online.college.enums;

import lombok.Getter;

/**
 * @Author:cys
 * @Date:Created in 15:34 2017/12/13
 */
@Getter
public enum StatusEnum {
    /**
     * 待审核（0），审核通过（1），默认（2），审核未通过（3），禁用（5）
     */
    WAITING(0,"待审核"),
    PASS(1,"审核通过"),
    DEFAULT(2,"默认"),
    NOT_PASS(3,"审核未通过"),
    DISABLE(4,"禁用"),
    ;
    private Integer code;
    private String msg;

    StatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
