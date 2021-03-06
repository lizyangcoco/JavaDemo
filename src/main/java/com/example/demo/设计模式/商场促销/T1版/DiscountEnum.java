package com.example.demo.设计模式.商场促销.T1版;

import com.example.demo.utils.KeyValue;

/**
 * @author by 李泽阳 @on 2020/12/1 17:42
 * @description:折扣率
 */
public enum DiscountEnum implements KeyValue {

    DISCOUNT_ONE(1, "一折"),
    DISCOUNT_TWO(2, "二折"),
    DISCOUNT_THREE(3, "三折"),
    DISCOUNT_FOUR(4, "四折"),
    ;

    DiscountEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static String getMsg(Integer code) {
        DiscountEnum[] discountEnums = DiscountEnum.values();
        for (DiscountEnum discountEnum : discountEnums) {

        }
        return "";
    }

    private Integer code;
    private String msg;

    @Override
    public Integer getCode() {
        return this.code;
    }

    @Override
    public String getMsg() {
        return this.msg;
    }
}
