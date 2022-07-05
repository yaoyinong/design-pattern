package com.yyn.策略模式.版本一;

/**
 * @author yaoyinong
 * @date 2022/7/5 14:56
 * @description
 */
public class Test {

    public static void main(String[] args) {
        double a = 4;
        double b = 2;
        CalculatorContext context = new CalculatorContext(new OperationAdd());
        System.out.println("a + b = "+context.executeStrategy(a, b));

        CalculatorContext context2 = new CalculatorContext(new OperationSub());
        System.out.println("a - b = "+context2.executeStrategy(a, b));

        CalculatorContext context3 = new CalculatorContext(new OperationMul());
        System.out.println("a * b = "+context3.executeStrategy(a, b));

        CalculatorContext context4 = new CalculatorContext(new OperationDiv());
        System.out.println("a / b = "+context4.executeStrategy(a, b));
    }

}
