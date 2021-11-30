package com.example.demo.设计模式.proxy.dynamic;

import com.example.demo.utils.People;
import com.example.demo.utils.PeopleT1;
import com.example.demo.utils.User;
import com.example.demo.utils.User1;
import org.junit.Test;

/**
 * @author by lizyang @on 2021/6/20 15:13
 * @description:
 */
public class ProxyTest {


    @Test
    public void test() {
        People userProxy = ProxyUser.newInstance(new User1());
        userProxy.eat();
        userProxy.sleep();




    }
}
