package com.yyn.责任链模式.版本二;

import com.yyn.责任链模式.版本二.base.AbstractHandler;

/**
 * @author yaoyinong
 * @date 2022/7/1 09:48
 * @description
 */
public class SecondPassHandler extends AbstractHandler {

    private int play() {
        return 90;
    }

    @Override
    public int handler() {
        System.out.println("第二关-->SecondPassHandler");
        int score = play();
        if (score >= 90) {
            if (super.next != null) {
                return super.next.handler();
            }
        }
        return score;
    }

}
