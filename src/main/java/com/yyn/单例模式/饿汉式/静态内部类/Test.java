package com.yyn.单例模式.饿汉式.静态内部类;

/**
 * @author yaoyinong
 * @date 2022/7/5 16:09
 * @description
 */
public class Test {

    public static void main(String[] args) {
        SingletonTest instance1 = SingletonTest.getInstance();
        SingletonTest instance2 = SingletonTest.getInstance();
        System.out.println(instance1 == instance2);
    }

}
