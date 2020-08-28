package com.example.demo.javax0.基础语法.集合;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * 迭代器：三种应用场景
 * 1、重点：对集合进行增加删除，禁止使用foreach，循环的动态操作
 * 2、倒序遍历
 * 3、重复不可更改
 *
 * @author 李泽阳 on 2020/1/14 12:14
 */
public class Iterator {
    public static void main(String[] args) {

        /**
         *         正例：
         *         Iterator<String> iterator = list.iterator();
         *         while (iterator.hasNext()) {
         *             String item = iterator.next();
         *             if (删除元素的条件) {
         *                 iterator.remove();
         *             }
         *         }
         *
         *         反例：
         *         List<String> list = new ArrayList<String>();
         *         list.add("1");
         *         list.add("2");
         *         for (String item : list) {
         *             if ("1".equals(item)) {
         *                 list.remove(item);
         *             }
         *         }
         */


        /**
         * 场景一：对集合进行删除，增加、for循环
         * 错误：这里会报出数据越界异常，
         * 因为：remove掉一个元素后，整个长度发生变化，所以发生异常
         * 改进：采用forList.size()动态
         */
        List<String> forList = new ArrayList<>();
        forList.add("a");
        forList.add("b");
        forList.add("c");
        int length = forList.size();
        for (int i = 0; i < length; i++) {
            if ("a".equals(forList.get(i))) {
                forList.remove(i);
            }
        }
        System.out.println(forList);

        /**
         * 产生新问题：
         * 错误：运行便会发现：将b移除不完整，
         * 因为：删除后整个游标向下，数组向上，刚好空出1个位置，紧接着的第二位没有进行比对，所以产生问题
         * 解决：数据长度减一与游标保持统一
         */
        List<String> forList1 = new ArrayList<>();
        forList1.add("a");
        forList1.add("b");
        forList1.add("b");
        forList1.add("c");
        for (int i = 0; i < forList1.size(); i++) {
            if ("b".equals(forList1.get(i))) {
                forList1.remove(i);
                i--;
            }
        }
        System.out.println(forList1);


        /**
         * 场景二：foreach循环，的remove/add操作
         */
        List<String> forEach = new ArrayList<>();
        forEach.add("a");
        forEach.add("b");
        forEach.add("c");
        for (String each : forEach) {
            if ("a".equals(each)) {
                forEach.remove(each);
            }
        }
        /**
         * 产生的异常：
         *   Exception in thread "main" java.util.ConcurrentModificationException
         * 	    at java.util.ArrayList$Itr.checkForComodification(ArrayList.java:909)
         * 	    at java.util.ArrayList$Itr.next(ArrayList.java:859)
         */
        /**
         * 源码：Itr实现了Iterator接口（删减部分）
         *  private class Itr implements Iterator<E> {
         *         @Override
         *         @SuppressWarnings("unchecked")
         *         public void forEachRemaining(Consumer<? super E> consumer) {
         *             Objects.requireNonNull(consumer);
         *             final int size = ArrayList.this.size;
         *             int i = cursor;
         *             if (i >= size) {
         *                 return;
         *             }
         *             final Object[] elementData = ArrayList.this.elementData;
         *             if (i >= elementData.length) {
         *                 throw new ConcurrentModificationException();
         *             }
         *             while (i != size && modCount == expectedModCount) {
         *                 consumer.accept((E) elementData[i++]);
         *             }
         *             // update once at end of iteration to reduce heap write traffic
         *             cursor = i;
         *             lastRet = i - 1;
         *             checkForComodification();
         *         }
         *
         *          如果有更改则抛出ConcurrentModificationException异常，
         *
         *         final void checkForComodification() {
         *         之前的版本不等于，当前的版本，判断为数据更新了。
         *         那么？为什么产生这样的判断呢，因为你删除后变为新数组，来不及更新版本，jvm不知道你当前数据状态，是否变化，无法再进行遍历
         *             if (modCount != expectedModCount)
         *                 throw new ConcurrentModificationException();
         *         }
         *     }
         */

        /**
         * 改进：删除数组元素
         */
        List<String> forEachIterator = new ArrayList<>();
        forEachIterator.add("a");
        forEachIterator.add("b");
        forEachIterator.add("c");
        java.util.Iterator<String> iterator = forEachIterator.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if ("a".equals(next)) {
                iterator.remove();
            }
        }

        /**
         * 场景三： 应用：倒序遍历
         */
        List<String> forEachIteratorDown = new ArrayList<>();
        forEachIteratorDown.add("a");
        forEachIteratorDown.add("b");
        forEachIteratorDown.add("c");

        ListIterator<String> item = forEachIteratorDown.listIterator();
        // 这里需要先将指针移向最后一位，再进行倒叙
        while (item.hasNext()) {
            item.next();
        }
        while (item.hasPrevious()) {
            String previous = item.previous();
            System.out.println(previous);
        }

    }
}
