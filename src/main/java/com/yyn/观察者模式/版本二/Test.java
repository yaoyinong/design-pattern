package com.yyn.观察者模式.版本二;

/**
 * @author yaoyinong
 * @date 2022/7/11 15:04
 * @description
 */
public class Test {

    public static void main(String[] args) {
        Rate rate = new RMBRate();
        Company watcher1 = new ImportCompany();
        Company watcher2 = new ExportCompany();
        rate.add(watcher1);
        rate.add(watcher2);
        rate.change(10);
        rate.change(-1);
    }

}
