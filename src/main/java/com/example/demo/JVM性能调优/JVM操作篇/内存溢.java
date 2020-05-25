package com.example.demo.JVM性能调优.JVM操作篇;

/**
 * Created by 李泽阳 on 2020/5/19 16:01
 */
public class 内存溢 {

    /**
     * 内存溢出
     * 程序在申请的时，没有足够的时间
     *
     *
     *
     * 1、栈的溢出     默认的为1M   stackOverflowError    outOfMemoryError
     *
     *
     * VM -xms30M，-Xmx30m   s初始30M，xMax最大30M
     *
     * 2、堆溢出
     *
     * 垃圾回收（线程）占用了超过98的资源，但是回收率不足2%会报错
     *
     * 方法区溢出（垃圾回收效率低）
     *
     * todo  内存溢出 内存泄漏区别//
     *
     * // 内存溢出是申请内存，内存不够用了，内存泄漏是程序申请内存后，无法释放申请的内存空间。
     *
     *
     */
}
