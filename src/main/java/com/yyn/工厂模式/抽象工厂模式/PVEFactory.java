package com.yyn.工厂模式.抽象工厂模式;

/**
 * @author yaoyinong
 * @date 2022/7/5 17:09
 * @description
 */
public class PVEFactory implements ComputerFactory{

    @Override
    public Game game() {
        return new DNF();
    }

    @Override
    public Game game2() {
        return new WOW();
    }

}
