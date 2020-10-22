package com.example.demo.project.异常;

import lombok.Data;

import java.util.logging.Logger;

/**
 * @author by 李泽阳 @on 2020/8/28 10:14
 * @description：
 */
@Data
public class BusinessException extends RuntimeException {
    private Integer code;
    private String mes;
    private Logger logger;

    public BusinessException() {

    }

    public BusinessException(Integer code, String mes) {
        this.code = code;
        this.mes = mes;
    }

    public BusinessException(String message, Integer code, String mes) {
        super(message);
        this.code = code;
        this.mes = mes;
    }

    public BusinessException(String message, Throwable cause, Integer code, String mes) {
        super(message, cause);
        this.code = code;
        this.mes = mes;
    }

    public BusinessException(Throwable cause, Integer code, String mes) {
        super(cause);
        this.code = code;
        this.mes = mes;
    }

    public BusinessException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, Integer code, String mes) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.code = code;
        this.mes = mes;
    }


}
