package com.yyn.工厂模式.工厂方法模式;

/**
 * @author yaoyinong
 * @date 2022/7/5 16:56
 * @description
 */
public class Test {

    public static void main(String[] args) {
        Game game1 = new LOLFactory().game();
        game1.play();
        Game game2 = new DNFFactory().game();
        game2.play();
        Game game3 = new WOWFactory().game();
        game3.play();
    }

}
