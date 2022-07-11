package com.yyn.观察者模式.版本一;

/**
 * @author yaoyinong
 * @date 2022/7/11 14:43
 * @description 具体目标
 */
public class ConcreteSubject extends Subject {

    @Override
    public void notifyObserver() {
        System.out.println("具体目标发生改变...");
        System.out.println("...................");
        observerList.forEach(Observer::response);
    }
}
