package com.example.demo.Javax0基础.JavaX基础语法.集合;

import java.util.LinkedList;
import java.util.List;

/**
 * LinkedList集合解析
 *
 * @author 李泽阳 on 2020/1/2 10:55
 */
public class ListLinkedList {

    /**
     * 1、数据结构，双向链表存储结构
     * 3、速度：add，remove，较快，get，，较慢
     * 4、线程安全：不是安全线程
     */
    private void testLinkedList() {
        /**
         * 场景一：
         *add，remove双向链表插入，删除
         */
        LinkedList linkedList = new LinkedList<>();
        linkedList.add("add");
       /*源码：
        void linkLast(E e) {
            final LinkedList.Node<E> l = last; //上一个节点
            final LinkedList.Node<E> newNode = new LinkedList.Node<>(l, e, null); //存储当前节点
            last = newNode;                     //更新上一个节点为
            if (l == null)
                first = newNode;
            else
                l.next = newNode;
            size++;
            modCount++;
        }*/


        /**
         * 场景二：
         * get查询较慢，双向链表查询
         */
        linkedList.get(1);
       /*双向链表查询源码：
        Node<E> node(int index) {
            // assert isElementIndex(index);
            if (index < (size >> 1)) {  //链表长度size>>1一位，index比size小
                Node<E> x = first;
                for (int i = 0; i < index; i++) //循环查询下标，获取节点
                    x = x.next;//返回下一个节点
                return x;
            } else {
                Node<E> x = last;
                for (int i = size - 1; i > index; i--) //循环查询下标，获取节点
                    x = x.prev;
                return x;   //返回上一个节点
            }
    }*/

        /**
         * 场景三：
         * 线程安全：非安全线程
         */
        linkedList.set(1, "set");
       /*源码：无线程安全
        public E set(int index, E element) {
            checkElementIndex(index);
            Node<E> x = node(index);
            E oldVal = x.item;
            x.item = element;
            return oldVal;
        }*/
    }


}
