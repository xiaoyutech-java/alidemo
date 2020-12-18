package com.xiaoyu.alidemo.api;

import com.xiaoyu.alidemo.api.model.ClientModel;

import java.util.List;

public interface ClientService {
    List<ClientModel> findAll();
}
