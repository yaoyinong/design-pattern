package com.yyn.代理模式.cglib;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author yaoyinong
 * @date 2022/7/13 16:51
 * @description
 */
public class ReflexTest {

    public String add() {
        System.out.println("执行add方法");
        return "okk";
    }

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<?> aClass = Class.forName("com.yyn.代理模式.cglib.ReflexTest");
        Object o = aClass.newInstance();
        Method add = aClass.getDeclaredMethod("add", null);
        Object result = add.invoke(o, null);
        System.out.println(result);

        String addOrder = "addOrder(String orderName)";
        System.out.println(addOrder.hashCode());

    }

}
