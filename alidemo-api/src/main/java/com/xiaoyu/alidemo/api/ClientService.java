package com.xiaoyu.alidemo.api;

import com.xiaoyu.alidemo.client.dataobject.ClientUserDO;

import java.util.List;

public interface ClientService {
    List<ClientUserDO> findAll();
}
