package com.yyn.装饰器模式;

/**
 * @author yaoyinong
 * @date 2022/7/11 13:54
 * @description
 */
public class Human implements Model {
    @Override
    public void assemble() {
        System.out.println("新建一个人");
    }
}
