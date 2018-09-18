package com.maileke.blog.common.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import redis.clients.jedis.JedisCluster;

/**
 * shieason 2018.09.18
 */
@Component
public class RedisUtils {

    @Autowired
    private  JedisCluster jedisCluster;

    public  void set(String key, String value) {
        jedisCluster.set(key,value);

    }

    public  String get(String key) {
        return jedisCluster.get(key);
    }

    public   void set(String key, String value, String nxxx, String expx, long time) {
        jedisCluster.set(key,value,nxxx,expx,time);
    }

    public   Long expire(String key, int seconds) {
        return jedisCluster.expire(key,seconds);
    }


}
