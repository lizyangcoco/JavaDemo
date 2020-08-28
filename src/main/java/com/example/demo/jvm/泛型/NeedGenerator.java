package com.example.demo.jvm.泛型;

/**
 * 类描述：泛型方法编写
 * Created by 李泽阳 on 2020/5/18 16:09
 */
public class NeedGenerator {

    // 相加x和y
    public int addInt(int x, int y) {
        return x + y;
    }

    // 相加x和y
    public float addFloat(float x, float y) {
        return x + y;
    }


    // 采用泛型编写, 这里T继承的是共同的数据类型
    public <T extends Number> double add(T x, T y) {
        return x.doubleValue() + y.doubleValue();
    }

    /*
     * 泛型注意写法
     * 1/2方法重构，类型不同切却编译通过，是泛型的类型擦除算法，
     *
    public void delete(List<String> lstStr) {

    }
    public void delete(List<Integer> lstStr) {

    }*/
}
