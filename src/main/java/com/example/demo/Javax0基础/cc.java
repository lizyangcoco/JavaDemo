package com.example.demo.Javax0基础;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
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
        //获取elementList内，类Element的name集合
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
}
