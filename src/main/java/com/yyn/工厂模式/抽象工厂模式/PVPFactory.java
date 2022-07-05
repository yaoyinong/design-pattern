package com.yyn.工厂模式.抽象工厂模式;

/**
 * @author yaoyinong
 * @date 2022/7/5 17:08
 * @description
 */
public class PVPFactory implements ComputerFactory{

    @Override
    public Game game() {
        return new LOL();
    }

    @Override
    public Game game2() {
        return new WOW();
    }

}
