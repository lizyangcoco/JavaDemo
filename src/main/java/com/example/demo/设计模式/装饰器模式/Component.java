package com.example.demo.设计模式.装饰器模式;

import java.util.concurrent.locks.ReadWriteLock;

public interface Component {

    /**
     * 装饰器的抽象行为
     */
    void operation();

    default ReadWriteLock getReadWriteLock() {
        return null;
    }
}
