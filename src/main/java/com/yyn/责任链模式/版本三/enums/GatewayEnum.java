package com.yyn.责任链模式.版本三.enums;

import com.yyn.责任链模式.版本三.entity.GatewayEntity;

/**
 * @author yaoyinong
 * @date 2022/7/1 09:54
 * @description
 */
public enum GatewayEnum {
    // handlerId, 拦截者名称，全限定类名，preHandlerId，nextHandlerId  
    API_HANDLER(new GatewayEntity(1, "api接口限流", "com.yyn.责任链模式.版本三.handler.ApiLimitGatewayHandler", null, 2)),
    BLACKLIST_HANDLER(new GatewayEntity(2, "黑名单拦截", "com.yyn.责任链模式.版本三.handler.BlacklistGatewayHandler", 1, 3)),
    SESSION_HANDLER(new GatewayEntity(3, "用户会话拦截", "com.yyn.责任链模式.版本三.handler.SessionGatewayHandler", 2, null)),
    ;

    private GatewayEntity gatewayEntity;

    public GatewayEntity getGatewayEntity() {
        return gatewayEntity;
    }

    GatewayEnum(GatewayEntity gatewayEntity) {
        this.gatewayEntity = gatewayEntity;
    }
}