package com.lug.test.main;

import org.apache.shiro.session.mgt.eis.RandomSessionIdGenerator;

public class RandomSessionIdGeneratorTest {
    public static void main(String[] args) {
        RandomSessionIdGenerator r = new RandomSessionIdGenerator();
        System.out.println(r.getRandom().nextInt());
    }
}
