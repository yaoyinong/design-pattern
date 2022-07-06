package com.yyn.模版模式;

/**
 * @author yaoyinong
 * @date 2022/7/5 15:14
 * @description
 */
public class GTAGame extends Game {
    @Override
    protected void runGame() {
        System.out.println("GTA启动");
    }

    @Override
    protected void startPlayGame() {
        System.out.println("疯狂玩耍");
    }

    @Override
    protected void endPlayGame() {
        System.out.println("关闭GTA");
    }
}
