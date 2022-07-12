package com.yyn.代理模式.jdk动态代理;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author yaoyinong
 * @date 2022/7/12 21:47
 * @description
 */
@Slf4j
public class MyInvocationHandler implements InvocationHandler {

    private Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log.info("目标方法之前执行：args:{}", args);
        Object invoke = method.invoke(target, args);
        log.info("目标方法之后执行：args:{}", args);
        return invoke;
    }

    public <T> T getProxy() {
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

}
