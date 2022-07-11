package com.yyn.观察者模式.版本一;

/**
 * @author yaoyinong
 * @date 2022/7/11 14:47
 * @description
 */
public class ConcreteObserver2 implements Observer{
    @Override
    public void response() {
        System.out.println("具体观察者2做出反应..");
    }
}
