package com.xiaoyu.alidemo.web;

import com.xiaoyu.alidemo.api.UserService;
import com.xiaoyu.alidemo.api.model.UserModel;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author <a href="mailto:chenxilzx1@gmail.com">theonefx</a>
 */
@Component
@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
private SqlSessionFactory sqlSessionFactory;
    //    http://127.0.0.1:8080/dao/get?id=48
    @RequestMapping("/dao/get")
    public String getUserName(@RequestParam("id") Long id) {
        sqlSessionFactory.getConfiguration();
        return userService.getUserName(id);
    }

    @RequestMapping("/dao/add")
    @ResponseBody
    public UserModel addUser(@RequestParam("name") String name, @RequestParam("age") Integer age) {
        UserModel user = new UserModel();
        user.setName(name);
        user.setAge(age);
        return userService.addUser(user);
    }
}
