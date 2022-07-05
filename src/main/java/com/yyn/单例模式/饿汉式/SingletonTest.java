package com.yyn.单例模式.饿汉式;

/**
 * @author yaoyinong
 * @date 2022/7/5 15:37
 * @description 饿汉式:
 */
public class SingletonTest {

    private SingletonTest() {
        System.out.println("饿汉式");
    }

    private static SingletonTest instance = new SingletonTest();

    public static SingletonTest getInstance() {
        return instance;
    }

}
