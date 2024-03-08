package com.xxl.rpc.server;

/**
 * HTTP 服务器接口
 *
 * @Author: xxl
 * @Date: 2024/03/08  16:51
 */
public interface HttpServer {

    /**
     * 启动服务器
     *
     * @param port
     */
    void doStart(int port);
}
