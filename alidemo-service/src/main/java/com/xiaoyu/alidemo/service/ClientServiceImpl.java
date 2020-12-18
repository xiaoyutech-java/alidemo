package com.xiaoyu.alidemo.service;

import com.xiaoyu.alidemo.api.ClientService;
import com.xiaoyu.alidemo.api.model.ClientModel;
import com.xiaoyu.alidemo.client.dataobject.ClientUserDO;
import com.xiaoyu.alidemo.client.mapper.ClientUserMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClientServiceImpl implements ClientService {
    @Autowired
    private ClientUserMapper clientUserMapper;

    // http://127.0.0.1:8080/user/findAll
    public List<ClientModel> findAll() {
        List<ClientUserDO> doList = clientUserMapper.findAll();
        List<ClientModel> result = new ArrayList<>();
        doList.forEach(dao -> {
            ClientModel model = new ClientModel();
            BeanUtils.copyProperties(dao, model);
            result.add(model);
        });
        return result;

    }
}
