package com.ljh.study.pattern.decorator;

/**
 * @description: 装饰者模式-鸡蛋
 * @author: Jh Lee
 * @create: 2019-03-22 21:47
 **/
public class EggDecorator extends CommodityDecorator {

    public EggDecorator(Commodity commodity) {
        super(commodity);
    }

    protected int getPrice() {
        return super.getPrice() + 2;
    }

    protected String getName() {
        return super.getName() + " + 鸡蛋";
    }
}
