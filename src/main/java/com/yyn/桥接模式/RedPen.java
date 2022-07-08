package com.yyn.桥接模式;

/**
 * @author yaoyinong
 * @date 2022/7/8 21:15
 * @description
 */
public class RedPen implements Pen {
    @Override
    public void write() {
        System.out.println("红笔写字");
    }
}
