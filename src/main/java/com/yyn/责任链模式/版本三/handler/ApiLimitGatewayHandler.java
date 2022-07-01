package com.yyn.责任链模式.版本三.handler;

import com.yyn.责任链模式.版本三.handler.base.GatewayHandler;

/**
 * @author yaoyinong
 * @date 2022/7/1 09:56
 * @description
 */
public class ApiLimitGatewayHandler extends GatewayHandler {

    private String operation() {
        return "ok";
    }

    @Override
    public String service() {
        System.out.println("api接口限流");
        String result = operation();
        if ("ok".equals(result)) {
            if (super.getNext() != null) {
                return super.next.service();
            }
        }
        return result;
    }

}
