package com.example.demo.redis;


import org.springframework.boot.autoconfigure.data.redis.RedisProperties;

import javax.transaction.Transaction;

public class AccessLimit {


    /**
     * 限流redis判断
     */
 /*   private boolean accessLimit(String ip, int limit, int time, RedisProperties.Jedis jedis) {
        boolean result = true;
        String key = "tate.limit:" + ip;
        // 如果key存在
        if (jedis.exists(key)) {
            long afterValue=jedis.incr(key);
            if (afterValue>limit){
                result=false;
            }
        }else {
            Transaction transaction=jedis.multi();
            transaction.incr();
            transaction.expire(key,time);
            transaction.exec();
        }
        return result;
    }*/
}
