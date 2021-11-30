package com.example.demo.设计模式.装饰器模式.decorators;

import com.example.demo.设计模式.装饰器模式.Component;

public class ConcreteDecoratorA implements Component {
    // 引入正在的初始化对象
    private final Component component;

    public ConcreteDecoratorA(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        // fixme 增强方法
    }
}
