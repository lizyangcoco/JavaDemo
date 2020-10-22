package com.example.demo.设计模式.工厂模式.简单工厂模型_计算器;

import com.example.demo.project.异常.BusinessException;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author by 李泽阳 @on 2020/10/22 17:34
 * @description:
 */
@Data
public class OperateDivide extends Operate {


    @Override
    public BigDecimal getResult() {
        BigDecimal result = new BigDecimal(0);
        if (NumberB.intValue() != 0) {
            result = NumberA.divide(NumberB);
        } else {
            throw new BusinessException(-1, "被除数不可为0!");
        }
        return result;
    }
}
