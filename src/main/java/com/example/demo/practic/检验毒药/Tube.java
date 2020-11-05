package com.example.demo.practic.检验毒药;

import lombok.Data;

/**
 * @author by 李泽阳 @on 2020/11/5
 * @description:试管
 */
@Data
public class Tube {
    /** 试管容量*/
    private Integer capacity;

    /** 是否有毒*/
    private Boolean bane;

    public Tube() {
        this.capacity = 0;
        this.bane = false;
    }

    /**
     * 吸管吸收
     */
    public void absorb(Boolean bane) {
        this.capacity += capacity;
        // 试管的特性，只有有毒情况下才可更改属性
        if (bane) {
            this.bane = bane;
        }
    }
}
