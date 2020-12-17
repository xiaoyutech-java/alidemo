package com.xiaoyu.alidemo.api;

import com.xiaoyu.alidemo.client.daoobject.ClientUser;

import java.util.List;

public interface ClientService {
    List<ClientUser> findAll();
}
