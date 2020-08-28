package com.example.demo.javax0.基础语法.集合;

import java.util.ArrayList;

/**
 * ArrayList集合解析
 * 应用场景：不适合多线程，多数组进行多次增删改查等操作
 *
 * @author 李泽阳 on 2020/1/1 13:56
 */
public class ListArrayList {
    /**
     * 1、数据结构，数组存储类型
     * 2、初始化：10个结构，后续以5个增加
     * 3、速度：set，get，add，较快，。remove，add，慢[后面数据移位]
     * 4、线程安全：不是安全线程
     */

    private void testArrayList() {


        /**
         * 场景一：
         */
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        // 初始定义一个常量为10，默认数据elementData，add时创建
        /**
         * Default initial capacity.
         * private static final int DEFAULT_CAPACITY = 10;
         * //调取add方法，创建一个elementData大小的数组
         * public boolean add(E e) {
         *      ensureCapacityInternal(size + 1);  // Increments modCount!!
         *      elementData[size++] = e;
         *      return true;
         * }*/

        /**
         * The array buffer into which the elements of the ArrayList are stored.
         * The capacity of the ArrayList is the length of this array buffer. Any
         * empty ArrayList with elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA
         * will be expanded to DEFAULT_CAPACITY when the first element is added.
         */
        //transient Object[] elementData;


        /**
         * 场景二： add，remove，数组位后移动，速度较慢
         */
        Object oldValue = arrayList.remove(1);
       /* 源码：
       public E remove(int index) {
            rangeCheck(index);//校验数据越界
            modCount++;
            E oldValue = elementData(index);//返回被删除数据
            int numMoved = size - index - 1;//需要被移动数组
            if (numMoved > 0)               //如果不是最后一位
                System.arraycopy(elementData, index+1, elementData, index,
                        numMoved);          //进行数据拷贝移动
            elementData[--size] = null;

            return oldValue;*/

        // 源码同上，直接移动拷贝
        arrayList.add(1, "add");


        /**
         * 场景三：非安全线程，多线程操作时，可能会数据操作失误。
         */
        Object setOldValue = arrayList.set(2, "set");
        /*源码：
        没有进行，加锁操作，所以不安全
        public E set(int index, E element) {
            rangeCheck(index);
            E oldValue = elementData(index);
            elementData[index] = element;
            return oldValue;
        }*/
    }


}
