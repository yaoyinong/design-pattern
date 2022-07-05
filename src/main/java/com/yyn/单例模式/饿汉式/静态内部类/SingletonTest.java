package com.yyn.单例模式.饿汉式.静态内部类;

/**
 * @author yaoyinong
 * @date 2022/7/5 15:37
 * @description 饿汉式:
 */
public class SingletonTest {

    /**
     * 私有构造方法
     */
    private SingletonTest() {
        System.out.println("静态内部类饿汉式");
    }

    private static class InsideSingletonTest {
        private static SingletonTest instance = new SingletonTest();
    }

    public static SingletonTest getInstance() {
        return InsideSingletonTest.instance;
    }

}
