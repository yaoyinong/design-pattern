package com.yyn.模版模式;

/**
 * @author yaoyinong
 * @date 2022/7/5 15:10
 * @description
 */
public abstract class Game {

    /**
     * 启动游戏
     */
    protected abstract void  runGame();

    /**
     * 选择人物
     */
    protected  void choosePerson() {};

    /**
     * 开始玩游戏
     */
    protected abstract void startPlayGame();

    /**
     * 结束游戏
     */
    protected abstract void endPlayGame();

    /**
     * 模版方法
     */
    public final void play(){
        runGame();
        choosePerson();
        startPlayGame();
        endPlayGame();
    }

}
