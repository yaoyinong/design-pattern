package com.yyn.观察者模式.版本二;

/**
 * @author yaoyinong
 * @date 2022/7/11 14:59
 * @description 具体目标：人民币汇率
 */
public class RMBRate extends Rate{
    @Override
    public void change(int number) {
        super.companyList.forEach(company -> company.response(number));
    }
}
