package com.yyn.责任链模式.版本二;

import com.yyn.责任链模式.版本二.base.AbstractHandler;

/**
 * @author yaoyinong
 * @date 2022/7/1 09:48
 * @description
 */
public class ThirdPassHandler extends AbstractHandler {

    private int play() {
        return 100;
    }

    @Override
    public int handler() {
        System.out.println("第三关-->ThirdPassHandler，这是最后一关");
        return play();
    }

}
