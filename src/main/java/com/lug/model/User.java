package com.lug.model;

import java.util.HashSet;
import java.util.Set;

public class User {
    public Set<Role> getRoles() {
        return new HashSet<Role>();
    }

    public String getPassword() {
        return "password";
    }

    public Dept getDept() {
        return new Dept();
    }
}
