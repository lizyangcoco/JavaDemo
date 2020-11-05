package com.example.demo.practic.检验毒药;

import lombok.Data;

/**
 * @author by 李泽阳 @on 2020/11/5
 * @description:瓶子
 */
@Data
public class Bottle {
    /**瓶子编号*/
    private Integer code;

    /** 是否具有毒药*/
    private Boolean bane;

    /**
     * 默认初始瓶子为无毒瓶
     */
    public Bottle() {
        this.bane = false;
    }
}
