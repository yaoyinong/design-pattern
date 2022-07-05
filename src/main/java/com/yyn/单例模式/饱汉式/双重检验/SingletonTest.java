package com.yyn.单例模式.饱汉式.双重检验;

/**
 * @author yaoyinong
 * @date 2022/7/5 15:46
 * @description 饱汉式
 */
public class SingletonTest {

    /**
     * 私有构造方法
     */
    private SingletonTest() {
        System.out.println("双重检验饱汉式");
    }

    private volatile static SingletonTest instance;

    public static SingletonTest getInstance() {
        if (instance == null) {
            synchronized (SingletonTest.class) {
                if (instance == null) {
                    instance = new SingletonTest();
                }
            }
        }
        return instance;
    }

}
