package com.example.demo.设计模式.proxy.dynamic;

import com.example.demo.utils.People;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author by lizyang @on 2021/6/20 14:45
 * @description:
 */
public class ProxyUser implements InvocationHandler {
    /**
     * 需要被代理的接口
     */
    private final Object people;

    public ProxyUser(People people) {
        this.people = people;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try {
            // 对object继承的方法忽略
            if (Object.class.equals(method.getDeclaringClass())) {
                return method.invoke(this, args);
            }
            // 对方法进行增强
            if ("sleep".equals(method.getName())) {
                System.out.println("我是动态代理：睡前洗脸");
                return method.invoke(people, args);
            } else if ("eat".equals(method.getName())) {
                // 调用原方法
                //method.invoke(people, args);
                System.out.println("我是动态代理：吃完饭喝水");
                // 前置增强
                return method.invoke(people, args);
            } else {
                return method.invoke(people, args);
            }
        } catch (Throwable t) {
            throw new Exception("t:" + t.getMessage());
        }
    }

    public static People newInstance(People people) {
        InvocationHandler handler = new ProxyUser(people);
        ClassLoader cl = People.class.getClassLoader();
        //return (People) Proxy.newProxyInstance(cl, people.getClass().getInterfaces(), handler);
        return (People) Proxy.newProxyInstance(cl, new Class[]{People.class}, handler);

    }

}
