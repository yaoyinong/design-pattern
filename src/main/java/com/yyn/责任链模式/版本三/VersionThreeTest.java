package com.yyn.责任链模式.版本三;

import com.yyn.责任链模式.版本三.factory.GatewayHandlerEnumFactory;
import com.yyn.责任链模式.版本三.handler.base.GatewayHandler;

/**
 * @author yaoyinong
 * @date 2022/7/1 10:38
 * @description
 */
public class VersionThreeTest {

    public static void main(String[] args) {
        GatewayHandler firstGatewayHandler = GatewayHandlerEnumFactory.getFirstGatewayHandler();
        String result = firstGatewayHandler.service();
        System.out.println("----->" + result + "<-----");
    }

}
