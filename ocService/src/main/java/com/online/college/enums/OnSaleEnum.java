package com.online.college.enums;

import lombok.Getter;

/**
 * @Author:cys
 * @Date:Created in 19:39 2017/12/13
 */
@Getter
public enum OnSaleEnum {
    DOWN_SALE(0,"下架"),
    ON_SALE(1,"上架"),
    ;
    private Integer code;
    private String msg;

    OnSaleEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
