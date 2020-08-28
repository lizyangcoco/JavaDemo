package com.example.demo.javax0.设计模型.模式练习;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 李泽阳 on 2019/12/31 11:45
 */


public class GirlFriend {
    private String name;
    private Integer age;
    private static int maxNumsOfGirlFriends = 2;//最大数量
    private static int number = 1;//当前编号
    //定义一个变量来存储创建好的类实例
    private static Map<String, GirlFriend> girlFriendMap = new HashMap<String, GirlFriend>();


    //私有化构造方法，防止外部调用
    private GirlFriend(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    //定义一个方法为程序员类提供女朋友实例
    public static GirlFriend getGirlFriend() {


        GirlFriend girlFriend = girlFriendMap.get(number + "");
        if (girlFriend == null) {
            //new一个新实例，并放到map中，用number当做key，实例是value
            girlFriend = new GirlFriend("小美", 28);
            girlFriendMap.put(number + "", girlFriend);
        }
        number++;
        if (number > maxNumsOfGirlFriends) {
            number = 1;
        }
        return girlFriend;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public Integer getAge() {
        return age;
    }


    public void setAge(Integer age) {
        this.age = age;
    }


}
