package com.example.demo.practic;

import com.example.demo.utils.DemoEntity;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author 李泽阳 on 2019/12/30 19:51
 */
public class cc {

    class Element {
        private String name;

        public String getName() {
            return name;
        }
    }

    private List<String> getElementName() {
        List<Element> elementList = new ArrayList<>();
        // 获取elementList内，类Element的name集合
        List<String> nameList = elementList.stream().
                map(Element::getName).collect(Collectors.toList());
        return nameList;
    }


    private void listArrListLinkedList() {
        List arrayList = new ArrayList();
        arrayList.get(0);
        arrayList.remove(0);
        List linkedList = new LinkedList();
    }


    static class test {

    }


   /* public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            test sql = new test();
            System.out.println(sql.toString());
            // sql.append("我是第" + (i+1) + "个创建的对象");
            System.out.println(sql.hashCode());
        }
        System.out.println("结束！！！");
      *//*  for (int i = 0; i <5 ; i++) {
            StringBuffer sql=new StringBuffer();
            System.out.println(sql.toString());
            System.identityHashCode(sql);
        }*//*

    }*/

    // 测试返回，判空处理
    private String testOptional(DemoEntity demoEntity) throws Exception {
        // 返回demoEntity 的name字段
       /* if (demoEntity!=null){
            return demoEntity.getDeName();
        }*/
        return Optional.ofNullable(demoEntity).map(DemoEntity::getDeName).orElse(null);


    }

    private void get() {

    }

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("1");
        stringList.add("2");
        stringList.add("3");
        stringList.add("4");
        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()) {
            iterator.remove();
        }
        System.out.println(stringList);
    }


}
