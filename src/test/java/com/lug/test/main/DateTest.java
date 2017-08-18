package com.lug.test.main;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class DateTest {

    public static void main(String[] args) {
        long l = System.currentTimeMillis()-86400000L;
        Date d = new Date(l);
        System.out.println(d);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String ds = simpleDateFormat.format(d);
        System.out.println(ds);
    }
}
