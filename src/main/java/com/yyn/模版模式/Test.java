package com.yyn.模版模式;

/**
 * @author yaoyinong
 * @date 2022/7/5 15:21
 * @description
 */
public class Test {

    public static void main(String[] args) {
        Game gta = new GTAGame();
        gta.play();

        System.out.println("--------------------");

        Game kof = new KOFGame();
        kof.play();
    }

}
