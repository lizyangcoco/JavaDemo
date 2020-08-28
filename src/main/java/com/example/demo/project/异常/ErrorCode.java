package com.example.demo.project.异常;


import java.util.Arrays;
import java.util.Optional;

/**
 * @description：
 * @Created by 李泽阳 @on 2020/8/28 10:53
 */
public enum ErrorCode implements KeyVal {


    SUCCESS(0, "成功"),
    FAIL(-1, "失败"),
    ;


    private Integer code;
    private String msg;

    ErrorCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    // 通过code获取字段值
    public static String getMsg(Integer code) {
        String msg = "";
        for (ErrorCode type : ErrorCode.values()) {
            if (type.code.equals(code)) {
                msg = type.getMsg();
                break;
            }
        }
        return msg;
    }

    // 通过value获取对应的枚举对象
    public static ErrorCode getErrorCode(int value) {
        Optional<ErrorCode> first = Arrays.stream(ErrorCode.values()).filter(item -> item.code == value).findFirst();
        if (first.isPresent()) {
            return first.get();
        }
        return null;
    }

    @Override
    public Integer getCode() {
        return this.code;
    }

    @Override
    public String getMsg() {
        return this.msg;
    }


    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


}
