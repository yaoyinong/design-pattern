package com.yyn.观察者模式.版本一;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yaoyinong
 * @date 2022/7/11 14:38
 * @description 抽象目标
 */
public abstract class Subject {

    protected List<Observer> observerList = new ArrayList<>();

    /**
     * 增加观察者方法
     */
    public void add(Observer observer) {
        observerList.add(observer);
    }

    /**
     * 删除观察者方法
     */
    public void remove(Observer observer) {
        observerList.remove(observer);
    }

    /**
     * 通知观察者方法
     */
    public abstract void notifyObserver();

}
