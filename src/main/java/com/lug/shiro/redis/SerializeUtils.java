package com.lug.shiro.redis;

import org.apache.shiro.session.Session;

public class SerializeUtils {
    public static byte[] serialize(Session session) {
        return new byte[]{};
    }

    public static Object serialize(byte[] bytes) {
        return new Object();
    }

    public static Object deserialize(byte[] bytes) {
        return new Object();
    }
}
