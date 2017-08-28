package com.lug.shiro.listener;

import org.apache.shiro.session.Session;
import org.apache.shiro.session.SessionListenerAdapter;

public class MyClassSessionListener extends SessionListenerAdapter {
    public MyClassSessionListener() {
        super();
    }

    @Override
    public void onStart(Session session) {
        super.onStart(session);
    }

    @Override
    public void onStop(Session session) {
        super.onStop(session);
    }

    @Override
    public void onExpiration(Session session) {
        super.onExpiration(session);
    }
}
