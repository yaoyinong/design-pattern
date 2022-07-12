package com.yyn.代理模式.jdk动态代理;

import com.yyn.代理模式.service.OrderService;
import com.yyn.代理模式.service.impl.OrderServiceImpl;

/**
 * @author yaoyinong
 * @date 2022/7/12 22:01
 * @description
 */
public class Test {

    public static void main(String[] args) {
        //将jdk动态生成的class保存到本地
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        OrderService orderService = new MyInvocationHandler(new OrderServiceImpl()).getProxy();
        String result = orderService.addOrder("动态代理test");
        System.out.println(result);
    }

}
