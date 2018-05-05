package com.online.college.enums;

import lombok.Getter;

/**
 * @Author:cys
 * @Date:Created in 19:43 2017/12/13
 */
@Getter
public enum FreeEnum {
    NO_FREE(0,"不免费"),
    FREE(1,"免费"),
    ;
    private Integer code;
    private String  msg;

    FreeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
