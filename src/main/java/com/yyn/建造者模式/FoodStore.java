package com.yyn.建造者模式;

/**
 * @author yaoyinong
 * @date 2022/7/6 09:41
 * @description
 */
public class FoodStore {

    public Meal createMeal(IBuilderFood food) {
        food.buildFood();
        food.buildDrink();
        return food.createMeal();
    }

}
