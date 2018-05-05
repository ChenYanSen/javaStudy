package com.online.college.enums;

import lombok.Getter;

/**
 * @Author:cys
 * @Date:Created in 19:50 2017/12/13
 */
@Getter
public enum RecommendEnum {
    NO_RECOMMEND(0,"未推荐"),
    RECOMMEND(1,"推荐"),
    ;
    private Integer code;
    private String msg;

    RecommendEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
