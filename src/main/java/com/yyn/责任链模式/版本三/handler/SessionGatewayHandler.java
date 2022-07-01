package com.yyn.责任链模式.版本三.handler;

import com.yyn.责任链模式.版本三.handler.base.GatewayHandler;

/**
 * @author yaoyinong
 * @date 2022/7/1 09:48
 * @description
 */
public class SessionGatewayHandler extends GatewayHandler {

    private String operation() {
        return "用户会话拦截完毕";
    }

    @Override
    public String service() {
        System.out.println("用户会话拦截");
        return operation();
    }

}
