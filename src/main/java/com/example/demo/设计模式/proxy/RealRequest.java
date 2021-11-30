package com.example.demo.设计模式.proxy;

/**
 * @author by lizyang @on 2021/6/1 23:55
 * @description:
 */
public class RealRequest extends Subject {
    @Override
    public void request() {
        /**
         * fixme 这里是真正的实现方法
         */
        System.out.println("真正的实现方法");
    }
}
