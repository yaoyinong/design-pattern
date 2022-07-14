package com.yyn.代理模式.cglib;

import com.yyn.代理模式.service.OrderService;
import com.yyn.代理模式.service.impl.OrderServiceImpl;
import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;

/**
 * @author yaoyinong
 * @date 2022/7/13 09:10
 * @description
 */
public class Test {

    public static void main(String[] args) {
        //将生成的代理类存放到指定目录
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "./cglib");

        MyCglibMethodInterceptor cglibMethodInterceptor = new MyCglibMethodInterceptor();
        //设置cglib代理类继承类（被代理类）
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(OrderServiceImpl.class);
        //设置目标方法回调方法
        enhancer.setCallback(cglibMethodInterceptor);
        OrderService orderService = (OrderService) enhancer.create();
        String cglibTest = orderService.addOrder("cglibTest");
        System.out.println(cglibTest);
    }

}
