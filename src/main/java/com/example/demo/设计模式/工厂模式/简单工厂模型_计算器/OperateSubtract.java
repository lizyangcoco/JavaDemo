package com.example.demo.设计模式.工厂模式.简单工厂模型_计算器;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author by 李泽阳 @on 2020/10/22 17:34
 * @description:
 */
@Data
public class OperateSubtract extends Operate {


    @Override
    public BigDecimal getResult() {
        BigDecimal result = new BigDecimal(0);
        result = NumberA.subtract(NumberB);
        return result;
    }
}
