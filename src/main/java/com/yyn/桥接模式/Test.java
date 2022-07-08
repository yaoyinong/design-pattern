package com.yyn.桥接模式;

/**
 * @author yaoyinong
 * @date 2022/7/8 21:19
 * @description
 */
public class Test {

    public static void main(String[] args) {
        Paper paper = new ExaminationPaper();
        paper.setPen(new RedPen());
        paper.writing();

        Paper paper1 = new NewPaper();
        paper1.setPen(new BlackPen());
        paper1.writing();
    }

}
