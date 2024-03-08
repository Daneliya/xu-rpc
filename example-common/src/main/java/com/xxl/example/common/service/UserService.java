package com.xxl.example.common.service;

import com.xxl.example.common.model.User;

/**
 * 用户服务
 *
 * @Author: xxl
 * @Date: 2024/03/08  16:28
 */
public interface UserService {

    /**
     * 获取用户
     *
     * @param user
     * @return
     */
    User getUser(User user);

}
