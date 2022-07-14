package com.yyn.代理模式.cglib;

import lombok.extern.slf4j.Slf4j;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author yaoyinong
 * @date 2022/7/13 09:05
 * @description
 */
@Slf4j
public class MyCglibMethodInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        log.info("cglib动态代理-目标方法之前....");
        //调用目标方法
        Object result = proxy.invokeSuper(obj, args);
        log.info("cglib动态代理-目标方法之后....");
        return result;
    }
}
