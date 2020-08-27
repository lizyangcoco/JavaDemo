package com.example.demo.jvm.泛型;

/**
 * Created by 李泽阳 on 2020/5/18 16:03
 */
public interface Generator<T> {
    public String next(T t);
}
