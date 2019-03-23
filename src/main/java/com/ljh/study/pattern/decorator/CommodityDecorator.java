package com.ljh.study.pattern.decorator;

/**
 * @description: 扩展用的装饰者类
 * @author: Jh Lee
 * @create: 2019-03-22 22:03
 **/
public class CommodityDecorator extends Commodity {

    //商品属性，这个是超父类
    private Commodity commodity;

    //扩展类构造器
    public CommodityDecorator(Commodity commodity) {
        this.commodity = commodity;
    }


    protected int getPrice() {
        return this.commodity.getPrice();
    }

    protected String getName() {
        return this.commodity.getName();
    }
}
