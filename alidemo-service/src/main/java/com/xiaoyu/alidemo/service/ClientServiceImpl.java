package com.xiaoyu.alidemo.service;

import com.xiaoyu.alidemo.api.ClientService;
import com.xiaoyu.alidemo.client.daoobject.ClientUser;
import com.xiaoyu.alidemo.client.mapper.MybatisDemoUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClientServiceImpl implements ClientService {

    @Autowired
    private MybatisDemoUserMapper mybatisDemoUserMapper;

    // http://127.0.0.1:8080/user/findAll
    public List<ClientUser> findAll() {
        return mybatisDemoUserMapper.findAll();
    }
}
