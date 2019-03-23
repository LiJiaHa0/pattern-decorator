package com.ljh.study.pattern.decorator;

/**
 * @description: 装饰者模式-测试类
 * @author: Jh Lee
 * @create: 2019-03-22 21:48
 **/
public class DecoratorTest {

    public static void main(String[] args) {

        //新建一个商品
        Commodity commodity ;
        //实例化商品，先买碗面条
        commodity = new Noodle() ;
        //不够吃，再加个鸡蛋
        commodity = new EggDecorator(commodity);
        //再来份青菜
        commodity = new VegetablesDecorator(commodity);
        System.out.println("买了：" + commodity.getName() +"，价格为：" + commodity.getPrice());
    }
}
