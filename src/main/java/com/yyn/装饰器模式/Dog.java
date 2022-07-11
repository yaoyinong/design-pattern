package com.yyn.装饰器模式;

/**
 * @author yaoyinong
 * @date 2022/7/11 13:56
 * @description
 */
public class Dog implements Model{
    @Override
    public void assemble() {
        System.out.println("新建一只狗");
    }
}
