package com.xxl.example.provider;

import com.xxl.example.common.service.UserService;
import com.xxl.rpc.registry.LocalRegistry;
import com.xxl.rpc.server.HttpServer;
import com.xxl.rpc.server.VertxHttpServer;

/**
 * 服务提供者示例
 *
 * @Author: xxl
 * @Date: 2024/03/08  16:41
 */
public class EasyProviderExample {
    public static void main(String[] args) {
        // 注册服务
        LocalRegistry.register(UserService.class.getName(), UserServiceImpl.class);

        // 启动 web 服务
        HttpServer httpServer = new VertxHttpServer();
        httpServer.doStart(8081);
    }
}