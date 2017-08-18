package com.lug.redisUtil;

import java.util.logging.Logger;

public class LogContext {
    public static LogContext instance() {
        return new LogContext();
    }

    private LogContext(){

    }

    public void warn(Logger logger_failure, String s, String key, Object size, Exception e) {
    }

    public void debug(Logger logger_default, String s, String key, String value) {
    }

    public void warn(Logger logger_failure, String s, long incrementValue, Exception e) {
    }

    public void debug(Logger logger_default, String s, String key, int size) {
    }

    public void debug(Logger logger_default, String s, String key, String[] value) {
    }

    public void warn(Logger logger_failure, String s, String key, String[] value, Exception e) {
    }

    public void warn(Logger logger_failure, String s, String i, Exception e) {
    }

    public void debug(Logger logger_default, String s, String key, String field,Object value) {
    }

    public void warn(Logger logger_failure, String s, String key, String field, String value, Exception e) {
    }

    public void debug(Logger logger_default, String s) {
    }
}
