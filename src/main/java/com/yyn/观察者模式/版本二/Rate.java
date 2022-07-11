package com.yyn.观察者模式.版本二;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yaoyinong
 * @date 2022/7/11 14:55
 * @description 抽象目标：汇率
 */
public abstract class Rate {

    protected List<Company> companyList = new ArrayList<>();

    public void add(Company company) {
        companyList.add(company);
    }

    public void remove(Company company) {
        companyList.remove(company);
    }

    public abstract void change(int number);

}
