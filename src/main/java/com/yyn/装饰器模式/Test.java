package com.yyn.装饰器模式;

import javax.jws.WebParam;

/**
 * @author yaoyinong
 * @date 2022/7/11 14:24
 * @description
 */
public class Test {

    public static void main(String[] args) {
//        Model human = new Human();
//        human.assemble();
//        Model dog = new Dog();
//        dog.assemble();

        Model hModel = new LightSaber(new Human());
        hModel.assemble();
        Model dModel = new RocketLauncher(new Dog());
        dModel.assemble();
    }

}
