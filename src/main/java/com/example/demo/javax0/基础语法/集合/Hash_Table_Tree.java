package com.example.demo.javax0.基础语法.集合;

import java.util.*;

/**
 * HasMap集合类，treeMap
 * Created by 李泽阳 on 2020/4/11 20:29
 */
public class Hash_Table_Tree {

    /**
     * HashMap
     * 1、null和null
     * 2、无序的排列
     * 3、非安全线程
     */
    public void hashMapTest() throws Exception {
        //HasMap,为非安全线程，
        //无序集合，
        Map<String, Object> map = new HashMap<>();
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        map.put("k4", "v4");
        //将其变为安全线程
        Collections.synchronizedMap(map);
    }

    /**
     * LinkedHashMap
     * 2、唯一区别，有序排列
     */
    public void linkHashMapTest() throws Exception {
        //HasMap,为非安全线程，
        //无序集合，
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        map.put("k4", "v4");
        //将其变为安全线程
        Collections.synchronizedMap(map);
    }

    /**
     * hashTable
     * 1、不允许任何null值和null建
     * 2、hashTable中的元素没有顺序（跟添加顺序无关）
     * 3、hashTable是线程安全
     */
    public void hashTable() {
        Map<String, String> map = new Hashtable<>();
        //全部实现了 synchronized 所以线程安全
        map.put("", "");

    }

    /**
     * treeMap
     * 1、可按照key自定义排序
     * 2、不是线程安全
     */
    public void treeMapTest() throws Exception {

        Map<person, Object> mapTree = new TreeMap();
        mapTree.put(new person("1", 10), "v1");
        mapTree.put(new person("2", 20), "v2");
        mapTree.put(new person("3", 30), "v3");
        mapTree.put(new person("4", 40), "v4");
        mapTree.put(new person("5", 50), "v5");
        System.out.println(mapTree);

    }


    class person implements Comparable<person> {
        public person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        private String name;
        private int age;


        @Override
        public int compareTo(person o) {
            return this.age - o.age;
        }
    }
}
