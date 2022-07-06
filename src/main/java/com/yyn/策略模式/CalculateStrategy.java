package com.yyn.策略模式;

/**
 * @author yaoyinong
 * @date 2022/7/5 14:40
 * @description
 */
public interface CalculateStrategy {

    //抽象策略
    double doOperation(double num1, double num2);

}

/**
 * 策略1
 */
class OperationAdd implements CalculateStrategy {

    @Override
    public double doOperation(double num1, double num2) {
        return num1 + num2;
    }

}

/**
 * 策略2
 */
class OperationSub implements CalculateStrategy {

    @Override
    public double doOperation(double num1, double num2) {
        return num1 - num2;
    }

}

/**
 * 策略3
 */
class OperationMul implements CalculateStrategy {

    @Override
    public double doOperation(double num1, double num2) {
        return num1 + num2;
    }

}

/**
 * 策略4
 */
class OperationDiv implements CalculateStrategy {

    @Override
    public double doOperation(double num1, double num2) {
        return num1 / num2;
    }

}
