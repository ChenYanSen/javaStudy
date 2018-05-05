package com.online.college.enums;

import lombok.Getter;


@Getter
public enum GenderEnum {
    WOMAN(0,"女"),
    MAN(1,"男"),

    ;
    private Integer code;
    private String msg;

    GenderEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
