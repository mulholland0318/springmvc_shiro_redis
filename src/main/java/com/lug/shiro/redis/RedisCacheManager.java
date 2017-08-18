package com.lug.shiro.redis;

import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheException;
import org.apache.shiro.cache.CacheManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ConcurrentHashMap;


public class RedisCacheManager implements CacheManager{

    private static final Logger logger = LoggerFactory.getLogger(RedisCacheManager.class);
    private boolean isEnableDebug = false;

    private final ConcurrentHashMap<String,Cache> caches = new ConcurrentHashMap<String,Cache>();

    private JedisPoolManager redisManager;


    public RedisCacheManager(){

    }



    public <K, V> Cache<K, V> getCache(String s) throws CacheException {
        if(isEnableDebug()){
            logger.debug("获取名称为："+s+" 的RedisCache的实例");
        }
        Cache c = caches.get(s);
        if( null == c){
            c = new RedisCache<K,V>(redisManager);
        }
        return c;
    }

    public boolean isEnableDebug() {
        return isEnableDebug;
    }

    public void setEnableDebug(boolean enableDebug) {
        isEnableDebug = enableDebug;
    }

    public void setRedisManager(JedisPoolManager redisManager) {
        this.redisManager = redisManager;
    }
}
