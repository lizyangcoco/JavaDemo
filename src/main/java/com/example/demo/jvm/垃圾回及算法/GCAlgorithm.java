package com.example.demo.jvm.垃圾回及算法;

/**
 * 类描述：GC垃圾回收算法
 * Created by 李泽阳 on 2020/5/18 20:19
 */
public class GCAlgorithm {


    /**
     *
     * todo  1、复制算法，2、标记算法，3、标记整理算法
     *
     * todo 复制算法，在堆内存中基本比例8：1：1，
     * 分比规则
     * 因为在java中的98%以上的内容是不需要回收的，所以为8，而1：1是指进行复制算法时的空间必须大小相等
     *
     *
     * 优点：简单高效，不会出现内存碎片问他
     * 缺点：内存利用率低，只有一半使用，存活对象较多时，效率低下。
     *
     *
     *
     * todo 标记算法
     * 标记清除，
     * 优点：利用率100%
     * 缺点：标记清除速率慢，存留空间碎片
     *
     *
     * todo 标记整理算法
     * 优点：利用率100%，无内存空间碎片
     * 缺点：标记速率慢，移动排序速率慢
     *
     *
     * todo CMS初始标记，并发标记，并发暂停，并发清除 G1算法等
     *
     *
     */
}
