package com.yyn.装饰器模式;

/**
 * @author yaoyinong
 * @date 2022/7/11 13:59
 * @description
 */
public class LightSaber extends AddExtra{

    public LightSaber(Model model) {
        super(model);
    }

    @Override
    public void assemble() {
        model.assemble();
        addLightSaber();
    }

    public void addLightSaber() {
        System.out.println("添加光剑");
    }
}
