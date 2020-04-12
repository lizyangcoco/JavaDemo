package com.example.demo.Javax8新特性;

import com.example.demo.utils.DemoEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * stream代替List写法
 *
 * @author 李泽阳 on 2019/12/27 15:34
 */
public class StreamReList {
    /**
     * list由stream处理示例
     */
    public void testStreamReList(List<DemoEntity> demoEntityList) {

        Stream<DemoEntity> entityStream = demoEntityList.stream();
        //获取一个并行的流文件
        Stream<DemoEntity> deParallel = demoEntityList.parallelStream();

        //lambda表达式,做简单的for循环
        demoEntityList.forEach(demoEntity -> System.out.println("lambda表达式"));

        /**
         * *******场景一：*******
         * 根据某Id，获取实体对象列表
         * 原解法：
         */
        List<DemoEntity> resultById = new ArrayList();
        for (DemoEntity d : demoEntityList) {
            if ("id".equals(d.getId())) {
                resultById.add(d);
            }
        }
        //改进：
        demoEntityList.parallelStream().filter(demoEntity -> "id".equals(demoEntity.getId())).collect(Collectors.toList());

        /**
         * *******场景二：*******
         * 根据某Id，获取对象列表内的某个元素列表
         * 原解法：
         */
        List<String> resultByIdStr = new ArrayList();
        for (DemoEntity d : demoEntityList) {
            if ("id".equals(d.getId())) {
                resultByIdStr.add(d.getDeName());
            }
        }
        //改进：
        demoEntityList.parallelStream().filter(demoEntity -> "id".equals(demoEntity.getId())).map(DemoEntity::getDeName).collect(Collectors.toList());


        /**
         * *******场景三：*******
         * 多条件查询取值，根据某id，获取实体对象列表，的deName值，并且deName=‘t’的对象集合
         * 原解法：
         */
        List<DemoEntity> resultByIdStrName = new ArrayList();
        for (DemoEntity d : demoEntityList) {
            if ("id".equals(d.getId())) {
                if ("t".equals(d.getDeName())) {
                    resultByIdStrName.add(d);
                }
            }
        }
        //改进：
        demoEntityList.parallelStream().filter(demoEntity -> "id".equals(demoEntity.getId())).filter(demoEntity -> "t".equals(demoEntity.getDeName())).collect(Collectors.toList());

        /**
         * *******场景四：*******
         * 删除集合内，某个字段值
         * 原解法：
         */
        for (DemoEntity d : demoEntityList) {
            if ("id".equals(d.getId())) {
                d.setDeAge(null);
                d.setDeName(null);
            }
        }
        //改进：
        demoEntityList.parallelStream().peek(demoEntity -> {
            demoEntity.setDeName(null);
            demoEntity.setDeAge(null);
        }).collect(Collectors.toList());

        /**
         * 改进场景：更换id为“1”的名称为“t”
         */
        demoEntityList.parallelStream().peek(demoEntity -> {
            if ("1".equals(demoEntity.getId())) {
                demoEntity.setDeName("t");
            }
        }).collect(Collectors.toList());
    }


    private void testLambda() {
        List list = new ArrayList();
        //循环此list
        for (int i = 0; i < list.size(); i++) {
            System.out.println("for循环");
        }
        for (Object o : list) {
            System.out.println("forEach循环");
        }
        //这里我们的 lambda 登场了
        //解决，option，stream，提出来的
        list.forEach(s -> {
            System.out.println("lambda表达式循环");
        });
    }
}
