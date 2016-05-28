package com.jiesen.pattern.builder;

/**
 * 百事冷饮
 * Created by sen on 16-5-28.
 */
public class Pepsi extends ColdDrink {
    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
