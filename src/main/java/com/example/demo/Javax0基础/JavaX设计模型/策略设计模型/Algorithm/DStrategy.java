package com.example.demo.Javax0基础.JavaX设计模型.策略设计模型.Algorithm;

import com.example.demo.Javax0基础.JavaX设计模型.策略设计模型.SelectStrategy;


/**
 * A类型的选择策略
 *
 * @author 李泽阳 on 2020/1/10 15:22
 */
public class DStrategy implements SelectStrategy {
    @Override
    public void selectAlgorithm() throws Exception {
        System.out.println("我选择的是D类型方法");
    }
}
