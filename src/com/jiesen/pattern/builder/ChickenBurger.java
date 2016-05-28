package com.jiesen.pattern.builder;

/**
 * 鸡肉汉堡包
 * Created by sen on 16-5-28.
 */
public class ChickenBurger extends Burger {
    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
