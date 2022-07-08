package com.yyn.桥接模式;

/**
 * @author yaoyinong
 * @date 2022/7/8 21:16
 * @description
 */
public class BlackPen implements Pen{
    @Override
    public void write() {
        System.out.println("黑笔写字");
    }
}
