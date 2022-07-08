package com.yyn.桥接模式;

/**
 * @author yaoyinong
 * @date 2022/7/8 21:18
 * @description
 */
public class ExaminationPaper extends Paper{

    @Override
    void writing() {
        pen.write();
    }
}
