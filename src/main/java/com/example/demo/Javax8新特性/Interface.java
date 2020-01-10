package com.example.demo.Javax8新特性;

/**
 * Interface 新特性，公共工具类可在接口中声明、可默认不用实现 default
 *
 * @author 李泽阳 on 2020/1/2 14:41
 */
public interface Interface {
    /**
     * 场景一：
     * 公共类编写，不再只能在class内编写，interface也可以
     * 外部调用：Interface.isEmpty
     */
    public static boolean isEmpty(Object str) {
        if (!"".equals(str) && null != str) {
            return false;
        }
        return true;
    }


    /**
     * 场景二：
     * 实现类，可不用再手动实现，可默认实现
     */

    interface testInterfaceA {
        public default void save(Class<? extends Object> entityClass) {

        }
    }

    //实现方法
    class interfaceClass implements testInterfaceA {
        //在这里直接调用，而不用再进行接口的实现
        private void testSave() {
            save(null);
        }
    }


}
