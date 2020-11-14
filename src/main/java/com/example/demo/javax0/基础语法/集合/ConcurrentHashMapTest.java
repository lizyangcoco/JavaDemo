package com.example.demo.javax0.基础语法.集合;

import java.io.ObjectStreamField;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.*;
import java.util.Iterator;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.*;
import java.util.stream.Stream;

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
        /**
         *
         */


        Map map = new HashMap<>(10);
        map.put("10", "10");
        // 线程不安全，fixme 多线程下的线程不安全，在put的时候会导致死循环，导致cpu卡死

        // 解决采用,hashTable,添加 fixme synchronized 关键字 效率底下
        Hashtable hashtable = new Hashtable();
        hashtable.put("", "");
        /**
         *     public synchronized V put(K key, V value) {
         *         // Make sure the value is not null
         *         if (value == null) {
         *             throw new NullPointerException();
         *         }
         *
         *         // Makes sure the key is not already in the hashtable.
         *         Entry<?,?> tab[] = table;
         *         int hash = key.hashCode();
         *         int index = (hash & 0x7FFFFFFF) % tab.length;
         *         @SuppressWarnings("unchecked")
         *         Entry<K, V> entry = (Entry<K,V>)tab[index];
         *         for(; entry != null ; entry = entry.next) {
         *             if ((entry.hash == hash) && entry.key.equals(key)) {
         *                 V old = entry.value;
         *                 entry.value = value;
         *                 return old;
         *             }
         *         }
         *
         *         addEntry(hash, key, value, index);
         *         return null;
         *     }
         */


    }


}
