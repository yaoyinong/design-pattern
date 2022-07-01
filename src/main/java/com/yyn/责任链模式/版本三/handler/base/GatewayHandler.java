package com.yyn.责任链模式.版本三.handler.base;

import lombok.Data;

/**
 * @author yaoyinong
 * @date 2022/7/1 10:33
 * @description
 */
@Data
public abstract class GatewayHandler {

    protected GatewayHandler next;

    public void setNext(GatewayHandler next) {
        this.next = next;
    }

    public abstract String service();

}
