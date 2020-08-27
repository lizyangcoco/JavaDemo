package com.example.demo.practic;

/**
 * 单例模式手撕代码 练习
 *
 * @author 李泽阳 on 2019/12/31 16:37
 */
public class December19_31 {

    private String name;
    private String age;
    public static December19_31 december19_31;

    private December19_31() {

    }

    public static December19_31 getInstance() {
        if (december19_31 == null) {
            synchronized (December19_31.class) {
                if (december19_31 == null) {
                    return new December19_31();
                }
            }
        }

        return december19_31;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
