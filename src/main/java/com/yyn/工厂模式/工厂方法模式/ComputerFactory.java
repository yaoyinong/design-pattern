package com.yyn.工厂模式.工厂方法模式;

/**
 * @author yaoyinong
 * @date 2022/7/5 16:54
 * @description
 */
public interface ComputerFactory {

    Game game();

}

class LOLFactory implements ComputerFactory{

    @Override
    public Game game() {
        return new LOL();
    }

}

class DNFFactory implements ComputerFactory{

    @Override
    public Game game() {
        return new DNF();
    }

}

class WOWFactory implements ComputerFactory{

    @Override
    public Game game() {
        return new WOW();
    }

}