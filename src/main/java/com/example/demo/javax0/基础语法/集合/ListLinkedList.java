package com.example.demo.javax0.基础语法.集合;

import java.util.LinkedList;

/**
 * LinkedList集合解析
 *
 * @author 李泽阳 on 2020/1/2 10:55
 */
public class ListLinkedList {

    /**
     * 1、数据结构，双向链表存储结构
     * 2、速度：add，remove，较快，get，，较慢
     * 3、线程安全：不是安全线程
     */
    private void testLinkedList() {

        LinkedList<Object> linkedList = new LinkedList<>();



        /**
         * 场景一：add，remove双向链表插入，删除
         */
        linkedList.add("add");
        /**
         * add源码：
         *   void linkLast(E e) {
         *         LinkedList.Node<E> l = this.last; //上一个节点
         *         LinkedList.Node<E> newNode = new LinkedList.Node(l, e, (LinkedList.Node)null); //存储当前节点
         *         this.last = newNode;         //更新上一个节点为
         *         if (l == null) {
         *             this.first = newNode;
         *         } else {
         *             l.next = newNode;
         *         }
         *
         *         ++this.size;
         *         ++this.modCount;
         *     }
         */


        /**
         * 场景二： get查询较慢，双向链表查询
         */
        linkedList.get(1);
        /**
         * get源码：
         *   LinkedList.Node<E> node(int index) {
         *         LinkedList.Node x;
         *         int i;
         *         if (index < this.size >> 1) {  //链表长度size>>1一位，index比size小
         *             x = this.first;
         *             for(i = 0; i < index; ++i) { //循环查询下标，获取节点
         *                 x = x.next; //返回下一个节点
         *             }
         *             return x;
         *         } else {
         *             x = this.last;
         *
         *             for(i = this.size - 1; i > index; --i) { //循环查询下标，获取节点
         *                 x = x.prev;
         *             }
         *             return x; //返回上一个节点
         *         }
         *     }
         */


        /**
         * 场景三： 线程安全：非安全线程
         */
        linkedList.set(1, "set");
        /**
         * 非安全线程：
         *   public void set(E e) {
         *             if (this.lastReturned == null) {
         *                 throw new IllegalStateException();
         *             } else {
         *                 this.checkForComodification();
         *                 this.lastReturned.item = e;
         *             }
         *         }
         */

    }


}
