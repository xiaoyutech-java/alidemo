package com.xiaoyu.alidemo.api;

import com.xiaoyu.alidemo.client.daoobject.MybatisDemoUser;

import java.util.List;

public interface ClientService {
    List<MybatisDemoUser> findAll();
}
