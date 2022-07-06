package com.yyn.责任链模式.版本三.dao;

import com.yyn.责任链模式.版本三.entity.GatewayEntity;

public interface GatewayDao {

    /**
     * 根据 handlerId 获取配置项
     *
     * @param handlerId
     * @return
     */
    GatewayEntity getGatewayEntity(Integer handlerId);

    /**
     * 获取第一个处理者
     *
     * @return
     */
    GatewayEntity getFirstGatewayEntity();
} 