package com.yyn.单例模式.饿汉式;

/**
 * @author yaoyinong
 * @date 2022/7/5 15:50
 * @description
 */
public class Test {

    public static void main(String[] args) {
        SingletonTest instance1 = SingletonTest.getInstance();
        SingletonTest instance2 = SingletonTest.getInstance();
        System.out.println(instance1 == instance2);
    }

}
