package com.yyn.工厂模式.简单工厂模式;

/**
 * @author yaoyinong
 * @date 2022/7/5 16:37
 * @description
 */
public interface Game {

    void play();

}

class LOL implements Game {

    @Override
    public void play() {
        System.out.println("玩LOL...");
    }

}

class DNF implements Game {

    @Override
    public void play() {
        System.out.println("玩DNF...");
    }

}