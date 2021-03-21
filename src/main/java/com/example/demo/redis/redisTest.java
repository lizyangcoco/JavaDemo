package com.example.demo.redis;

/**
 * @author by 李泽阳 @on 2021/3/21 19:48
 * @description:
 */
public class redisTest {

   /* @Override
    public void testRequest(Integer uid) {
       *//* redisUtil.increment(uid.toString(), 1);
        String num = (redisUtil.get(uid.toString()));
        if (Integer.valueOf(num) > 1) {
            System.out.println("订单重复提交");
            //redisUtil.del(uid.toString());
        } else {
            System.out.println("正常业务流程++++++++++++++++++++++++++++++");
            // 释放redis uid
            redisUtil.del(uid.toString());
        }*//*

        this.testRequest1(10);
    }


    public void testRequest1(Integer uid) {
        // 根据业务节点区分uid setNX
        Boolean aBoolean = redisTemplate.opsForValue().setIfAbsent(uid.toString(), uid);
        if (aBoolean) {
            System.out.println("正常业务流程++++++++++++++++++++++++++++++");
            // 释放redis uid
            redisUtil.del(uid.toString());
        } else {
            System.out.println("数据重复消费");
        }
    }*/
}
