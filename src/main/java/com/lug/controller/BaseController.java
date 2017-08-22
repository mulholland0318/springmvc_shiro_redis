package com.lug.controller;

import java.util.UUID;

public class BaseController {
    public String getId(){
        return UUID.randomUUID().toString().replace("-","");
    }
}
