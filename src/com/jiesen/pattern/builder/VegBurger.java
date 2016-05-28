package com.jiesen.pattern.builder;

/**
 * 蔬菜汉堡包
 * Created by sen on 16-5-28.
 */
public class VegBurger extends Burger {
    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
