package com.yyn.工厂模式.简单工厂模式;

/**
 * @author yaoyinong
 * @date 2022/7/5 16:42
 * @description
 */
public class Test {

    public static void main(String[] args) {
        Game game1 = ComputerFactory.game("lol");
        game1.play();

        Game game2 = ComputerFactory.game("dnf");
        game2.play();
    }

}
