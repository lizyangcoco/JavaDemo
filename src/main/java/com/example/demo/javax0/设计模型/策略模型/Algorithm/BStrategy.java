package com.example.demo.javax0.设计模型.策略模型.Algorithm;

import com.example.demo.javax0.设计模型.策略模型.SelectStrategy;

/**
 * A类型的选择策略
 *
 * @author 李泽阳 on 2020/1/10 15:22
 */
public class BStrategy implements SelectStrategy {
    @Override
    public void selectAlgorithm() throws Exception {
        System.out.println("我选择的是B类型方法");

    }
}
