package com.example.demo.javax0.基础语法.集合;

/**
 * @author 李泽阳 on 2020/1/15 10:23
 */
public class SetEntity {
    private String name;
    private Integer age;
    // 默认构造器
    public SetEntity() {
    }


    // 重写toString方法
    @Override
    public String toString() {
        return "SetEntity{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    // 构造器
    public SetEntity(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    // 重写equals方法，
    @Override
    public boolean equals(Object obj) {
        boolean isEq = false;
        if (obj instanceof SetEntity) {
            SetEntity objEntity = (SetEntity) obj;
            if (this.age.equals(objEntity.age) && this.name.equals(objEntity.name)) {
                isEq = true;
            }
        }
        return isEq;
    }

    // 重写hashCode
    @Override
    public int hashCode() {
        return 1;
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
