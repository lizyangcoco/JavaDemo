package com.example.demo.JVM性能调优.泛型;

/**
 * 类描述：实现泛型的方式
 * Created by 李泽阳 on 2020/5/18 16:01
 */
public class ImplGenerator<T> implements Generator<T> {
    @Override
    public String next(T t) {
        return "txt";
    }
}
