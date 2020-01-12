package com.example.demo.Javax0基础.JavaX设计模型.策略设计模型.Algorithm;

import com.example.demo.Javax0基础.JavaX设计模型.策略设计模型.SelectStrategy;

/**
 * 默认类型的选择策略
 *
 * @author 李泽阳 on 2020/1/10 15:22
 */
public class DefaultStrategy implements SelectStrategy {
    @Override
    public void selectAlgorithm() throws Exception {
        System.out.println("我是默认选择调用方式");


    }
}
