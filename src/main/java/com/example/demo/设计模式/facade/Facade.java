package com.example.demo.设计模式.facade;

import com.example.demo.设计模式.facade.sub.SubSystemFour;
import com.example.demo.设计模式.facade.sub.SubSystemOne;
import com.example.demo.设计模式.facade.sub.SubSystemThree;
import com.example.demo.设计模式.facade.sub.SubSystemTwo;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author by lizyang @on 2021/5/31 23:28
 * @description:外观类
 */
public class Facade {
    @Autowired
    private SubSystemOne systemOne;
    @Autowired
    private SubSystemTwo systemTwo;
    @Autowired
    private SubSystemThree systemThree;
    @Autowired
    private SubSystemFour subSystemFour;

    public Facade() {
        this.systemOne = new SubSystemOne();
        this.systemTwo = new SubSystemTwo();
        this.systemThree = new SubSystemThree();
        this.subSystemFour = new SubSystemFour();
    }



    /**
     * 组合A方法
     */
    public void methodA() {
        systemOne.methodOne();
        systemTwo.methodTwo();

        

    }

    /**
     * 组合B方法
     */
    public void methodB() {
        systemOne.methodOne();
        systemTwo.methodTwo();
        systemThree.methodThree();
    }


    /**
     * 测试类
     */
    public void mainT() {
        Facade facade = new Facade();
        facade.methodA();
        facade.methodB();
    }
}
