package com.example.demo.javax0.基础语法.集合;

import com.example.demo.javax0.基础语法.集合.entity.SetEntity;

import java.util.HashSet;
import java.util.Set;

/**
 * set集合解析
 * 1、无序性
 * 2、唯一性
 * 3、只允许有一个null
 *
 * @author 李泽阳 on 2020/1/15 9:29
 */
public class SetCollection {

    /**
     * set集合解析
     * 1、无序性
     * 2、唯一性
     * 3、只允许有一个null
     * 强制：写在开头的强制
     * 1、只要重写equals方法，就必须重写hashCode
     * 2、set存储的是不重复对象，依据hashCode，equals进行判断，所以set必须重写。
     */
    public static void main(String[] args) {
        /**
         * 场景一：
         * 唯一性,及其处理方法，源码
         */
        Set<String> setStr = new HashSet<>();
        setStr.add("a");
        setStr.add("a");
        setStr.add("b");
        //这里输出两个a已经去重
        System.out.println(setStr);

        //接下来，创建一个set类
        Set<SetEntity> setEntities = new HashSet<>();
        setEntities.add(new SetEntity("set1", 15));
        setEntities.add(new SetEntity("set1", 15));
        setEntities.add(new SetEntity("set3", 17));
        setEntities.add(new SetEntity("set4", 18));
        System.out.println(setEntities);
        //上面的添加，并没有去掉重复的，？？？（输出后发现）
        /**
         * 接着思考改进：
         * 对equals方法进行重载。可否实现，相同？
         * 对名称相同，年龄相同便认为相同
         */
        System.out.println(setEntities);
        //发现并没有，去重，再对hashcode进行重写,直接返回1，发现去掉了重复？
        /**
         * add源码：
         * 在这里发现，拿到key之后，进行了hash(key)获取其key的hash值
         * public V put(K key, V value) {
         *         return putVal(hash(key), key, value, false, true);
         *     }
         * 下面的源码非常不好理解，只用读懂一句话就可以了
         * final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
         *                    boolean evict) {
         *         Node<K,V>[] tab; Node<K,V> p; int n, i;
         *         if ((tab = table) == null || (n = tab.length) == 0)
         *             n = (tab = resize()).length;
         *         if ((p = tab[i = (n - 1) & hash]) == null)
         *             tab[i] = newNode(hash, key, value, null);
         *         else {
         *             Node<K,V> e; K k;
         *             在这里：p和e就是要添加的元素和上个节点元素对比，
         *             如果p的hash和e的hash相等，并且key也相同，就默认把p赋给e，就实现了去重
         *             if (p.hash == hash &&
         *                 ((k = p.key) == key || (key != null && key.equals(k))))
         *                 e = p;
         *             else if (p instanceof TreeNode)
         *                 e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
         *             else {
         *                 for (int binCount = 0; ; ++binCount) {
         *                     if ((e = p.next) == null) {
         *                         p.next = newNode(hash, key, value, null);
         *                         if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
         *                             treeifyBin(tab, hash);
         *                         break;
         *                     }
         *                     if (e.hash == hash &&
         *                         ((k = e.key) == key || (key != null && key.equals(k))))
         *                         break;
         *                     p = e;
         *                 }
         *             }
         *             if (e != null) { // existing mapping for key
         *                 V oldValue = e.value;
         *                 if (!onlyIfAbsent || oldValue == null)
         *                     e.value = value;
         *                 afterNodeAccess(e);
         *                 return oldValue;
         *             }
         *         }
         *         ++modCount;
         *         if (++size > threshold)
         *             resize();
         *         afterNodeInsertion(evict);
         *         return null;
         *     }
         *
         */
        //上述源码难看懂，不过看懂其中一句便可，解决去重问题。
        //如果p的hash和e的hash相等，并且key也相同，就默认把p赋给e，就实现了去重


        /**
         * 总结：
         * 所以set集合内的元素，要对equals进行重写，就必须对hashCode方法进行重写
         */



    }


}
