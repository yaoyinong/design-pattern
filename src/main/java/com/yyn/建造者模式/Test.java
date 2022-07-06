package com.yyn.建造者模式;

/**
 * @author yaoyinong
 * @date 2022/7/6 09:42
 * @description
 */
public class Test {

    public static void main(String[] args) {
        FoodStore foodStore = new FoodStore();
        Meal breakfast = foodStore.createMeal(new Breakfast());
        Meal lunch = foodStore.createMeal(new Lunch());
        System.out.println("小明早上吃的是" + breakfast.getFoot() + ",喝的是" + breakfast.getDrink());
        System.out.println("小明中午吃的是" + lunch.getFoot() + ",喝的是" + lunch.getDrink());
    }

}
