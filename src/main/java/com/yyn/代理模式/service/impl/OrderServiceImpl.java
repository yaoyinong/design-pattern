package com.yyn.代理模式.service.impl;

import com.yyn.代理模式.service.OrderService;
import lombok.extern.slf4j.Slf4j;

/**
 * @author yaoyinong
 * @date 2022/7/12 21:27
 * @description
 */
@Slf4j
public class OrderServiceImpl implements OrderService {
    @Override
    public String addOrder(String orderName) {
        log.info("进行新增Order：{}", orderName);
        return "ok";
    }

}
