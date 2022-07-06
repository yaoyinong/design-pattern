package com.yyn.策略模式;

/**
 * @author yaoyinong
 * @date 2022/7/5 14:51
 * @description
 */
public class CalculatorContext {

    private CalculateStrategy strategy;

    public CalculatorContext(CalculateStrategy strategy) {
        this.strategy = strategy;
    }

    public double executeStrategy(double num1, double num2) {
        return strategy.doOperation(num1, num2);
    }
}
