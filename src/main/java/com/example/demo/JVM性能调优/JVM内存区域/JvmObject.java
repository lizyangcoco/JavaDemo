package com.example.demo.JVM性能调优.JVM内存区域;

import com.example.demo.utils.UserDemo;

import java.util.Collections;
import java.util.Map;

/**
 * Created by 李泽阳 on 2020/5/23 14:35
 */
public class JvmObject {
    /**
     * todo JVM对象的分配
     * <p>
     * 1、线程私有：程序计数器，虚拟机栈，本地方法栈
     * <p>
     * 2、线程共享：堆，方法区
     * <p>
     * 堆是内存分配和垃圾回收的重点区域，几乎所有的对象都是在堆中分配。
     */


    public Map userDemo() {
        UserDemo userDemo = new UserDemo();
        /**
         * 一：创建new一个对象的步骤：
         *
         * 1、检查类加载   校验要创建的对象是否加载进来
         * 2、分配内存
         *      划分内存，指针碰撞（规整内存指针向下移动）&&空闲列表（非规整在空闲列表内进行分配）
         *      并发安全，CAS原子操作（比较交换）机制进行失败重试。
         * 3、内存空间初始化
         *      对象头（8个字节整数）   对象年龄，锁状态标志，线程持有锁，线程锁ID，
         *      实例数据  程序代码中所自定义的各种数据类型
         *      对其填充
         * 4、设置
         * 5、对象初始化
         *
         *
         * 二：对象的访问方式
         * 1、使用句柄
         *      句柄池，指向对象实例数据
         *      方法区域
         * 2、直接指针（速度快）
         *      对象数据类型，直接指向对象类型数据
         *
         * 三：堆内存的分配策略
         *
         * 新生代：PSYoungGen
         *      比例8:Eden空间
         *      比例1:form Survivor 空间
         *      比例1:to Survivor   空间
         * 老年代：ParOldGen
         * 对象分配策略：
         * 0、对象优先在Eden内分配
         * 1、大对象直接进入老年代
         * 2、长期存活的对象分配进老年代
         * 3、动态对象年龄判定
         * 4、空间分配担保
         *
         *
         */
        return Collections.EMPTY_MAP;
    }
}
