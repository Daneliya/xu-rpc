package com.xxl.example.consumer;

import com.xxl.example.common.model.User;
import com.xxl.example.common.service.UserService;
import com.xxl.rpc.proxy.ServiceProxyFactory;

/**
 * 服务消费者示例
 *
 * @Author: xxl
 * @Date: 2024/03/08  16:34
 */
public class ConsumerExample {

    public static void main(String[] args) {
        // 静态代理
//        UserService userService = new UserServiceProxy();
        // 动态代理
        UserService userService = ServiceProxyFactory.getProxy(UserService.class);
        User user = new User();
        user.setName("yupi");
        // 调用
        User newUser = userService.getUser(user);
        if (newUser != null) {
            System.out.println(newUser.getName());
        } else {
            System.out.println("user == null");
        }
    }


}
