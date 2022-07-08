package com.yyn.桥接模式;

/**
 * @author yaoyinong
 * @date 2022/7/8 21:16
 * @description
 */
public abstract class Paper {

    protected Pen pen;

    void setPen(Pen pen) {
        this.pen = pen;
    }

    abstract void writing();

}
