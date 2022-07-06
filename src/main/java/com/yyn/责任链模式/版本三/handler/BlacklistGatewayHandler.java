package com.yyn.责任链模式.版本三.handler;

import com.yyn.责任链模式.版本三.handler.base.GatewayHandler;

/**
 * @author yaoyinong
 * @date 2022/7/1 09:48
 * @description
 */
public class BlacklistGatewayHandler extends GatewayHandler {

    private String operation() {
        return "ok";
    }

    @Override
    public String service() {
        System.out.println("黑名单拦截");
        String result = operation();
        if ("ok".equals(result)) {
            if (super.next != null) {
                return super.next.service();
            }
        }
        return result;
    }

}
