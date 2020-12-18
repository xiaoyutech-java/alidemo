package com.xiaoyu.alidemo.service;

import com.xiaoyu.alidemo.api.DaoService;
import com.xiaoyu.alidemo.api.model.DaoModel;
import com.xiaoyu.alidemo.dao.dataobject.DaoUserDO;
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

    private static final BeanCopier copier = BeanCopier.create(DaoModel.class, DaoUserDO.class, false);

    public String getUserName(Long id) {
        DaoUserDO daoUserDO = actionUserMapper.getById(id);
        return daoUserDO != null ? daoUserDO.getName() : null;
    }

    public DaoModel addUser(DaoModel user) {
        DaoUserDO daoUserDO = new DaoUserDO();
        copier.copy(user, daoUserDO, null);

        Long id = actionUserMapper.insert(daoUserDO);
        user.setId(id);
        return user;
    }
}
