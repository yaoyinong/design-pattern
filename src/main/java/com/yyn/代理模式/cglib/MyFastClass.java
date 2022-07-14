package com.yyn.代理模式.cglib;

import com.yyn.代理模式.service.impl.OrderServiceImpl;

import java.lang.reflect.InvocationTargetException;

/**
 * @author yaoyinong
 * @date 2022/7/13 16:36
 * @description
 */
public class MyFastClass {

    /**
     * 提前映射目标方法中的每个方法对应的index关系
     * @param sign
     * @return
     */
    public int getIndex(String sign) {
        switch (sign.hashCode()) {
            case -1857744284:
                return 10;
            default:
                return 0;
        }
    }

    public Object invoke(int index, Object obj, Object[] args) {
        OrderServiceImpl orderService = (OrderServiceImpl) obj;
        switch (index) {
            case 10:
                return orderService.addOrder((String) args[0]);
        }
        return null;
    }


    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        String addOrder = "addOrder(String orderName)";
        MyFastClass myFastClass = new MyFastClass();
        int index = myFastClass.getIndex(addOrder);
        System.out.println("方法前增强");
        myFastClass.invoke(index, new OrderServiceImpl(), new Object[]{"tttttt"});
        System.out.println("方法后增强");
    }

}
