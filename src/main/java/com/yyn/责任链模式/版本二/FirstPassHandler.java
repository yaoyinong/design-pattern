package com.yyn.责任链模式.版本二;

import com.yyn.责任链模式.版本二.base.AbstractHandler;

/**
 * @author yaoyinong
 * @date 2022/7/1 09:56
 * @description
 */
public class FirstPassHandler extends AbstractHandler {

    private int play() {
        return 80;
    }

    @Override
    public int handler() {
        System.out.println("第一关-->FirstPassHandler");
        int score = play();
        if (score >= 80) {
            if (super.next != null) {
                return super.next.handler();
            }
        }
        return score;
    }

}
