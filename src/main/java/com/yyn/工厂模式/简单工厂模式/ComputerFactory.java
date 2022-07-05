package com.yyn.工厂模式.简单工厂模式;

/**
 * @author yaoyinong
 * @date 2022/7/5 16:38
 * @description
 */
public class ComputerFactory {

    private static final String LOL = "LOL";

    private static final String DNF = "DNF";

    public static Game game(String name) {
        if (LOL.equalsIgnoreCase(name)) {
            return new LOL();
        } else if (DNF.equalsIgnoreCase(name)) {
            return new DNF();
        }
        return null;
    }
}
