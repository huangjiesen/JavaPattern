package com.jiesen.pattern.builder;

/**
 * 冷饮
 * Created by sen on 16-5-28.
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}