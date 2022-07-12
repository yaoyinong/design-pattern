package com.yyn.代理模式.静态代理;

import com.yyn.代理模式.service.OrderService;
import lombok.extern.slf4j.Slf4j;

/**
 * @author yaoyinong
 * @date 2022/7/12 21:25
 * @description
 */
@Slf4j
public class OrderServiceProxy implements OrderService {

    private OrderService orderService;

    public OrderServiceProxy(OrderService orderService) {
        this.orderService = orderService;
    }


    @Override
    public String addOrder(String orderName) {
        log.info("在addOrder之前做操作");
        String result = orderService.addOrder(orderName);
        log.info("在addOrder之后做操作");
        return result;
    }
}
