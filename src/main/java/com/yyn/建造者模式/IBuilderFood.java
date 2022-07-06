package com.yyn.建造者模式;

/**
 * @author yaoyinong
 * @date 2022/7/6 09:34
 * @description
 */
public interface IBuilderFood {

    void buildFood();

    void buildDrink();

    Meal createMeal();

}
