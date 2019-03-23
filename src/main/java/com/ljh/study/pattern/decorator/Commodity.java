package com.ljh.study.pattern.decorator;

/**
 * @description: 装饰者模式-食物抽象类
 * @author: Jh Lee
 * @create: 2019-03-22 21:55
 **/
public abstract class Commodity {

    protected  abstract int getPrice();

    protected  abstract String getName();
}
