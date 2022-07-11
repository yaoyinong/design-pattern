package com.yyn.装饰器模式;

/**
 * @author yaoyinong
 * @date 2022/7/11 13:57
 * @description
 */
public abstract class AddExtra implements Model {

    protected Model model;

    public AddExtra(Model model) {
        this.model = model;
    }

    @Override
    public void assemble() {
        model.assemble();
    }
}
