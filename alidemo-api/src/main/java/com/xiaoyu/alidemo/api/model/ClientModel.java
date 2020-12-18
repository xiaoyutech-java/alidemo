package com.xiaoyu.alidemo.api.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class ClientModel implements Serializable {
    /**
     * 编号
     */
    private Long id;

    /**
     * 用户名
     */
    private String name;

    /**
     * 密码
     */
    private String password;
}
