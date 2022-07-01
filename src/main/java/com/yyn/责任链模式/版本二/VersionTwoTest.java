package com.yyn.责任链模式.版本二;

/**
 * @author yaoyinong
 * @date 2022/7/1 10:07
 * @description
 */
public class VersionTwoTest {

    public static void main(String[] args) {
        FirstPassHandler first = new FirstPassHandler();
        SecondPassHandler second = new SecondPassHandler();
        ThirdPassHandler third = new ThirdPassHandler();

        //拼装链
        first.setNext(second);
        second.setNext(third);
        int score = first.handler();
        System.out.println("最终得分：" + score);
    }

}
