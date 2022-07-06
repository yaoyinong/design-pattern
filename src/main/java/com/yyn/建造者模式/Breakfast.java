package com.yyn.建造者模式;

/**
 * @author yaoyinong
 * @date 2022/7/6 09:35
 * @description
 */
public class Breakfast implements IBuilderFood{

    private final Meal meal;

    public Breakfast() {
        this.meal = new Meal();
    }

    @Override
    public void buildFood() {
        meal.setFoot("包子");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("牛奶");
    }

    @Override
    public Meal createMeal() {
        return meal;
    }

}
