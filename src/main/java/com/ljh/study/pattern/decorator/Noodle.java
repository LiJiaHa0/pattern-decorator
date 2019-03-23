package com.ljh.study.pattern.decorator;

/**
 * @description: 装饰者模式-面条
 * @author: Jh Lee
 * @create: 2019-03-22 21:43
 **/
public class Noodle extends Commodity {



    protected int getPrice() {
        return 8;
    }

    protected String getName() {
        return "面条";
    }
}
