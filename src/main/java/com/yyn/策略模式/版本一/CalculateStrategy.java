package com.yyn.策略模式.版本一;

/**
 * @author yaoyinong
 * @date 2022/7/5 14:40
 * @description
 */
public interface CalculateStrategy {

    double doOperation(double num1, double num2);

}

class OperationAdd implements CalculateStrategy {

    @Override
    public double doOperation(double num1, double num2) {
        return num1 + num2;
    }

}

class OperationSub implements CalculateStrategy{

    @Override
    public double doOperation(double num1, double num2) {
        return num1 - num2;
    }

}

class OperationMul implements CalculateStrategy{

    @Override
    public double doOperation(double num1, double num2) {
        return num1 + num2;
    }

}

class OperationDiv implements CalculateStrategy{

    @Override
    public double doOperation(double num1, double num2) {
        return num1 / num2;
    }

}
