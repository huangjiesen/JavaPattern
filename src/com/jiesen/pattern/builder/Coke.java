package com.jiesen.pattern.builder;

/**
 * 可乐冷饮
 * Created by sen on 16-5-28.
 */
public class Coke extends ColdDrink {
    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
