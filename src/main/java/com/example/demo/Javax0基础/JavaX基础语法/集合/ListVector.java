package com.example.demo.Javax0基础.JavaX基础语法.集合;

import java.util.Vector;

/**
 * Vector集合解析
 * 应用场景：不可更改的多线程对象
 *
 * @author 李泽阳 on 2020/1/2 13:41
 */
public class ListVector {

    /**
     * vector和arrayList完全相同
     * 所有修改元素的操作，都进
     */
    public void testVector() {
        Vector vector = new Vector();
        vector.add("add");
        vector.set(1, "set");
        vector.remove(0);
        vector.get(1);
        //如下源码，所以的增删改查，都实现了，synchronized 加锁的操作

      /*源码：synchronized
        public synchronized E get(int index) {
        if (index >= elementCount)
            throw new ArrayIndexOutOfBoundsException(index);
        return elementData(index);
    }

       public synchronized boolean add(E e) {
            modCount++;
            ensureCapacityHelper(elementCount + 1);
            elementData[elementCount++] = e;
            return true;
        }*/

    }
}
