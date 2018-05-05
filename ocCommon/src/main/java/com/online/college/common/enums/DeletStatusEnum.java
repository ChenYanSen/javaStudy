package com.online.college.common.enums;

import lombok.Getter;

/**
 * @Author:cys
 * @Date:Created in 15:42 2017/12/13
 */
@Getter
public enum DeletStatusEnum {
    NOT_REAL_DELETE(0,"逻辑删除"),
    REAL_DELETE(1,"物理删除"),
    ;
    private Integer code;
    private String msg;

    DeletStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
