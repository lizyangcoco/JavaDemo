package com.example.demo.javax0.设计模型.策略模型;


import com.example.demo.javax0.设计模型.策略模型.Algorithm.AStrategy;

/**
 * 策略模型测试主方法
 *
 * @author 李泽阳 on 2020/1/10 16:07
 */
public class TestMain {

    public static void main(String[] args) throws Exception {
        //主动选择，算法策略
        OrdinaryEntity s = new OrdinaryEntity();//对象
        s.selectAlgorithm();//调用方法



        AStrategy strategy=new AStrategy();
        strategy.selectAlgorithm();

    }
}
