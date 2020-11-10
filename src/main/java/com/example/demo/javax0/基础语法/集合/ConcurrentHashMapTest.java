package com.example.demo.javax0.基础语法.集合;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author by 李泽阳 @on 2020/11/10 10:53
 * @description：
 */
public class ConcurrentHashMapTest {


    private static void test() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(10);
        concurrentHashMap.put("10", "t1");
        concurrentHashMap.put("10", "t1");
        concurrentHashMap.put("10", "t1");
        concurrentHashMap.put("10", "t1");
        concurrentHashMap.put("10", "t1");
        System.out.println(concurrentHashMap);

        Map map = new HashMap<>(10);
        map.put("10","10");

    }


    public static void main(String[] args) {
        test();
    }
}
