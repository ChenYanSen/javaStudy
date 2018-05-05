package com.online.college.enums;

import lombok.Getter;

/**
 * @Author:cys
 * @Date:Created in 19:45 2017/12/13
 */
@Getter
public enum LevelEnum {
    BEGINNER(1,"初级"),
    INTERMEDIATE(2,"中级"),
    ADVANCED(3,"高级"),
    ;
    private Integer code;
    private String msg;

    LevelEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
