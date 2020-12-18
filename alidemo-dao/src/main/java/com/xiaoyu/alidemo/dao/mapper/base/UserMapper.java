package com.xiaoyu.alidemo.dao.mapper.base;

import com.xiaoyu.alidemo.dao.dataobject.DaoUserDO;

/**
 * @author <a href="mailto:chenxilzx1@gmail.com">theonefx</a>
 */
//@Mapper
public interface UserMapper {

    DaoUserDO getByName(String name);

    DaoUserDO getById(Long id);

    Long insert(DaoUserDO daoUserDO);
}
