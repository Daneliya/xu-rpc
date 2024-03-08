package com.xxl.example.common.model;

import java.io.Serializable;

/**
 * 用户信息
 *
 * @Author: xxl
 * @Date: 2024/03/08  16:27
 */
public class User implements Serializable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
