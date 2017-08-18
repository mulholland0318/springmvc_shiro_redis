package com.lug.service;

import javax.annotation.Resource;
import javax.sql.DataSource;

public class BaseService {

    @Resource(name="dataSource")
    private DataSource dao;

    public void save(){
    }

    public void update(){

    }

    public void delete(String id){

    }
}
