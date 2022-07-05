package com.yyn.模版模式;

/**
 * @author yaoyinong
 * @date 2022/7/5 15:18
 * @description
 */
public class KOFGame extends Game {

    @Override
    protected void runGame() {
        System.out.println("拳皇启动");
    }

    @Override
    protected void choosePerson() {
        System.out.println("选择角色");
    }

    @Override
    protected void startPlayGame() {
        System.out.println("疯狂玩耍");
    }

    @Override
    protected void endPlayGame() {
        System.out.println("关闭拳皇");
    }
}
