package com.yyn.单例模式.枚举单例;

/**
 * @author yaoyinong
 * @date 2022/7/5 16:22
 * @description
 */
public class Test {

    public static void main(String[] args) {
        SingletonTest instance1 = SingletonTest.INSTANCE;
        SingletonTest instance2 = SingletonTest.INSTANCE;
        System.out.println(instance1 == instance2);
    }

}
