package com.xiaoyu.alidemo.api;


import com.xiaoyu.alidemo.api.model.DaoModel;

/**
 * @author <a href="mailto:chenxilzx1@gmail.com">theonefx</a>
 */
public interface DaoService {

    String getUserName(Long id);

    DaoModel addUser(DaoModel user);
}
