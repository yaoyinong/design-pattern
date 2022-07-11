package com.yyn.观察者模式.版本一;

/**
 * @author yaoyinong
 * @date 2022/7/11 14:48
 * @description
 */
public class Test {

    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer observer1 = new ConcreteObserver1();
        Observer observer2 = new ConcreteObserver2();
        subject.add(observer1);
        subject.add(observer2);
        subject.notifyObserver();
    }

}
