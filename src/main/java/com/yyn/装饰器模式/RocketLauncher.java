package com.yyn.装饰器模式;

/**
 * @author yaoyinong
 * @date 2022/7/11 14:02
 * @description
 */
public class RocketLauncher extends AddExtra {

    public RocketLauncher(Model model) {
        super(model);
    }

    @Override
    public void assemble() {
        model.assemble();
        addRocketLauncher();
    }

    public void addRocketLauncher() {
        System.out.println("添加火箭发射器");
    }


}
