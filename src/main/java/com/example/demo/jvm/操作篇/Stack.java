package com.example.demo.jvm.操作篇;

/**
 * 类描述：内存泄漏
 * //手写栈
 * Created by 李泽阳 on 2020/5/19 17:00
 */
public class Stack {


    /**
     * todo 1、长生命周期的对象持有短生命周期对象的引用
     *
     * todo 2、连接池未关闭
     * 数据库连接，网络连接，io连接没有进行try finally关闭连接
     *
     * todo 3、变量作用域不合理
     * 变量定义出来，范围大于了我使用的范围，没有及时把对象置null
     *
     * todo 4、内部类持有外部类
     *
     * todo 5、Hash值得改变
     *
     *
     */


    /**
     *
     * 1、内存溢出，内存泄漏
     *          内存溢出     内存溢出
     * 相同点：
     * 不同点：  内存不够     释放对象未释放，内存缩小
     *
     *
     * 2、如何避免？
     *
     * 内存溢出：
     * 检查代码是否有死循环，大对象
     * 调整虚拟机堆参数
     *
     * 内存泄漏
     * 一定是代码有问题
     *
     *
     *
     * 关联：
     * 内存溢出是内存泄漏导致得
     */

    public Object[] elements;
    private int size = 0;
    private static final int cap = 16;

    public Stack() {
        elements = new Object[cap];
    }


    public void push(Object e) {//入栈
        elements[size] = e;
        size++;
    }

    public Object pop() { //出栈
        size = size - 1;
        Object o = elements[size];

        // 如果不置空，对象的引用不对，造成引用报错
        // elements[size] = null;//让GC回收掉
        return o;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();//new 一个栈
        Object o = new Object();//new 一个对象
        System.out.println("o" + o);
        stack.push(o);//入栈
        Object o1 = stack.pop();//出栈
        System.out.println("o1" + o1);
        System.out.println(stack.elements[0]);//打印栈中的数据
    }

}
