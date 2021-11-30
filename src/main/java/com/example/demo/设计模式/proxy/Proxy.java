package com.example.demo.设计模式.proxy;

/**
 * @author by lizyang @on 2021/6/1 23:57
 * @description:代理者
 */
public class Proxy extends Subject {
    private RealRequest realRequest;

    @Override
    public void request() {
        if (realRequest == null) {
            // 懒加载模式
            realRequest = new RealRequest();
        }
        realRequest.request();
        // fixme 在这里进行业务增强，比如：增强打印功能，写日志功能，等...
    }
}
