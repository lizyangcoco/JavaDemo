package com.example.demo.设计模式.装饰器模式.cache;

import java.util.concurrent.locks.ReadWriteLock;

public interface Cache {


    String getId();


    void putObject(Object key, Object value);

    Object getObject(Object key);

    Object removeObject(Object key);


    void clear();


    int getSize();


    default ReadWriteLock getReadWriteLock() {
        return null;
    }

}
