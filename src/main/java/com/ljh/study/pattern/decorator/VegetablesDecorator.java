package com.ljh.study.pattern.decorator;

/**
 * @description: 装饰者模式-青菜，蔬菜
 * @author: Jh Lee
 * @create: 2019-03-22 21:45
 **/
public class VegetablesDecorator extends CommodityDecorator {

    public VegetablesDecorator(Commodity commodity) {
        super(commodity);
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 1;
    }

    @Override
    protected String getName() {
        return super.getName() + "，+ 青菜";
    }
}
