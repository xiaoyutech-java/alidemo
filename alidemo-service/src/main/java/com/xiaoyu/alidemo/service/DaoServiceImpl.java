package com.xiaoyu.alidemo.service;

import com.xiaoyu.alidemo.api.DaoService;
import com.xiaoyu.alidemo.api.model.UserModel;
import com.xiaoyu.alidemo.dao.dataobject.UserDO;
import com.xiaoyu.alidemo.dao.mapper.ActionUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.beans.BeanCopier;
import org.springframework.stereotype.Component;

/**
 * @author <a href="mailto:chenxilzx1@gmail.com">theonefx</a>
 */
@Component
public class DaoServiceImpl implements DaoService {

    @Autowired
    private ActionUserMapper actionUserMapper;

    private static final BeanCopier copier = BeanCopier.create(UserModel.class, UserDO.class, false);

    public String getUserName(Long id) {
        UserDO userDO = actionUserMapper.getById(id);
        return userDO != null ? userDO.getName() : null;
    }

    public UserModel addUser(UserModel user) {
        UserDO userDO = new UserDO();
        copier.copy(user, userDO, null);

        Long id = actionUserMapper.insert(userDO);
        user.setId(id);
        return user;
    }
}