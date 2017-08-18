package com.lug.shiro.redis;

import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheException;

import java.util.Collection;
import java.util.Set;

public class RedisCache<K, V> implements Cache {
    public RedisCache(JedisPoolManager redisManager) {

    }

    public Object get(Object o) throws CacheException {
        return null;
    }

    public Object put(Object o, Object o2) throws CacheException {
        return null;
    }

    public Object remove(Object o) throws CacheException {
        return null;
    }

    public void clear() throws CacheException {

    }

    public int size() {
        return 0;
    }

    public Set keys() {
        return null;
    }

    public Collection values() {
        return null;
    }
}
