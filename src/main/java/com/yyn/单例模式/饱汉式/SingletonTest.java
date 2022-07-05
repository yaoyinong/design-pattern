package com.yyn.单例模式.饱汉式;

/**
 * @author yaoyinong
 * @date 2022/7/5 15:46
 * @description 饱汉式
 */
public class SingletonTest {

    private SingletonTest() {
        System.out.println("饱汉式");
    }

    private static SingletonTest instance;

    public static SingletonTest getInstance() {
        if (instance == null) {
            instance = new SingletonTest();
        }
        return instance;
    }

}
