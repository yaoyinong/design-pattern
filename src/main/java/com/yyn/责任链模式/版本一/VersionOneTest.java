package com.yyn.责任链模式.版本一;

/**
 * @author yaoyinong
 * @date 2022/7/1 09:50
 * @description
 */
public class VersionOneTest {

    /**
     * 缺点：
     * 1. 每个关卡中都有下一关的成员变量并且是不一样的，形成链很不方便
     * 2. 代码的扩展性非常不好
     */
    public static void main(String[] args) {
        FirstPassHandler firstPassHandler = new FirstPassHandler();
        SecondPassHandler secondPassHandler = new SecondPassHandler();
        ThirdPassHandler thirdPassHandler = new ThirdPassHandler();

        //第一关的下一关是第二关
        firstPassHandler.setSecondPassHandler(secondPassHandler);
        //第二关的下一关是第三关
        secondPassHandler.setThirdPassHandler(thirdPassHandler);

        //说明：因为第三关是最后一关，因此没有下一关
        //开始调用第一关 每一个关卡是否进入下一关卡 在每个关卡中判断
        int score = firstPassHandler.handler();
        System.out.println("最终得分：" + score);
    }

}
