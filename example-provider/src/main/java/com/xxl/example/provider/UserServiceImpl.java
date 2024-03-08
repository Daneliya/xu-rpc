package com.xxl.example.provider;

import com.xxl.example.common.model.User;
import com.xxl.example.common.service.UserService;

/**
 * 用户服务实现类
 *
 * @Author: xxl
 * @Date: 2024/03/08  16:41
 */
public class UserServiceImpl implements UserService {

    public User getUser(User user) {
        System.out.println("用户名：" + user.getName());
        return user;
    }
}