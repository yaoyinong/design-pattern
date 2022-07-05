package com.yyn.工厂模式.抽象工厂模式;

/**
 * @author yaoyinong
 * @date 2022/7/5 16:56
 * @description
 */
public class Test {

    public static void main(String[] args) {
        ComputerFactory pveFactory = new PVEFactory();
        pveFactory.game().play();
        pveFactory.game2().play();
        System.out.println("--------------------");
        ComputerFactory pvpFactory = new PVPFactory();
        pvpFactory.game().play();
        pvpFactory.game2().play();
    }

}
