package com.example.demo.jvm.垃圾回及算法;

import com.example.demo.utils.UserDemo;

import java.lang.ref.SoftReference;
import java.util.LinkedList;
import java.util.List;

/**
 * 类描述：对象的软引用
 * Created by 李泽阳 on 2020/5/18 17:20
 */
public class SoftRefUser {
    /**
     * todo 对象引用的四种方式
     * 1、= 强引用
     * 2、软引用 SoftReference
     * 3、弱引用
     * 4、虚引用
     */
    UserDemo uSoft = new UserDemo();// =new是强引用对象
    // 软引用
    public void soft() {
        uSoft = null;//去掉强引用，确保实例只有userSoft的软引用
        SoftReference<UserDemo> userDemoSoftReference = new SoftReference<UserDemo>(uSoft);
        System.out.println(userDemoSoftReference.get());
        System.gc();// 全盘进行垃圾回收，业务开发代码的时候谨慎使用(时间长)
        System.out.println("GC回收后的...");
        System.out.println(userDemoSoftReference.get());//查看是否回收了数据


        //往堆中添加数据，导致OOM
        List<byte[]> list = new LinkedList<>();
        try {
            for (int i = 0; i < 100; i++) {
                list.add(new byte[1024 * 1024]);//1M的对象
            }
        } catch (Exception e) {
            //抛出OOM对象异常，并且打印软引用对象
            System.out.println("exception*********" + e.getMessage() + userDemoSoftReference.get());
        }


        /**
         * 软引用
         * todo 结论：强引用不会回收，直至内存OOM溢出，
         * todo 弱引用：会在内存满时进行数据回收。
         *
         *
         * 使用场景：缓存！！！，处理图片，
         *
         */
    }


    // 弱引用
    public void weak() {
        UserDemo uWeak = new UserDemo();//=new是强引用对象
        uWeak = null;//去掉强引用，确保实例只有userSoft的软引用
        SoftReference<UserDemo> userDemoSoftReference = new SoftReference<UserDemo>(uWeak);
        System.out.println(userDemoSoftReference.get());
        System.gc();//全盘进行垃圾回收，业务开发代码的时候谨慎使用
        System.out.println("GC回收后的...");
        System.out.println(userDemoSoftReference.get());//查看是否回收了数据

        /**
         * 弱引用
         * todo 结论：每次垃圾回收都会被回收
         *
         * 使用场景：ThreadLocal weakHashMap
         *
         */
    }


}
