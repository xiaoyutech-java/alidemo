package com.xiaoyu.alidemo.web;

import com.xiaoyu.alidemo.api.DaoService;
import com.xiaoyu.alidemo.api.model.DaoModel;
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
public class MybatisDaoController {

    @Autowired
    private DaoService daoService;

    //http://127.0.0.1:8080/dao/get?id=48
    @RequestMapping("/dao/get")
    public String getUserName(@RequestParam("id") Long id) {
        return daoService.getUserName(id);
    }

    @RequestMapping("/dao/add")
    @ResponseBody
    public DaoModel addUser(@RequestParam("name") String name, @RequestParam("age") Integer age) {
        DaoModel user = new DaoModel();
        user.setName(name);
        user.setAge(age);
        return daoService.addUser(user);
    }
}
