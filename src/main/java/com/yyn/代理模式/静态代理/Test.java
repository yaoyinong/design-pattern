package com.yyn.代理模式.静态代理;

import com.yyn.代理模式.service.impl.OrderServiceImpl;

/**
 * @author yaoyinong
 * @date 2022/7/12 21:27
 * @description
 */
public class Test {

    public static void main(String[] args) {
        /*
        相当于租房的人，找中介租房子
        OrderServiceProxy相当于中介
        OrderServiceImpl相当于房东
         */
        OrderServiceProxy orderServiceProxy = new OrderServiceProxy(new OrderServiceImpl());
        String test = orderServiceProxy.addOrder("Test");
        System.out.println(test);
    }

}
