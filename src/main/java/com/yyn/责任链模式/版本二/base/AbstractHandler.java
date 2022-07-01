package com.yyn.责任链模式.版本二.base;

/**
 * @author yaoyinong
 * @date 2022/7/1 09:54
 * @description
 */
public abstract class AbstractHandler {

    protected AbstractHandler next;

    public void setNext(AbstractHandler next) {
        this.next = next;
    }

    public abstract int handler();

}
