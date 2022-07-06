package com.yyn.建造者模式;

/**
 * @author yaoyinong
 * @date 2022/7/6 09:40
 * @description
 */
public class Lunch implements IBuilderFood {

    private final Meal meal;

    public Lunch() {
        this.meal = new Meal();
    }

    @Override
    public void buildFood() {
        meal.setFoot("牛肉面");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("可乐");
    }

    @Override
    public Meal createMeal() {
        return meal;
    }

}
