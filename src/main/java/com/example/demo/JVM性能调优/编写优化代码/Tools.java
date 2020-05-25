package com.example.demo.JVM性能调优.编写优化代码;

import java.util.Collections;
import java.util.List;

/**
 * Created by 李泽阳 on 2020/5/22 15:09
 */
public class Tools {


    /**
     * todo  工具类：不需要实例化的类应该私有化构造器
     * 例如arrays等一些基础类，就是这样设定
     * 防止：使用new对象实例
     *
     * todo 空返回，防止调用者多次判空
     */
    public static List get() {
        //返回空集合，或者Map等等...
        return Collections.EMPTY_LIST;
        //不建议返回null,方法调用者会进行多判断
        //return null;
    }

    //私有化构造器
    private Tools() {
    }


    public static void main(String[] args) {
        //私有化构造器，本类内私有可用
        Tools tools = new Tools();
        Tools.get();
    }

}
