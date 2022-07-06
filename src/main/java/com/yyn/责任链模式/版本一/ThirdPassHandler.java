package com.yyn.责任链模式.版本一;

/**
 * @author yaoyinong
 * @date 2022/7/1 09:48
 * @description
 */
public class ThirdPassHandler {

    //本关卡游戏得分
    private int play() {
        return 100;
    }

    /**
     * 这是最后一关，因此没有下一关
     */
    public int handler() {
        System.out.println("第三关-->ThirdPassHandler，这是最后一关");
        return play();
    }

}
