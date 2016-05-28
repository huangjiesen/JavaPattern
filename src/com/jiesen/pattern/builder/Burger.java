package com.jiesen.pattern.builder;

/**
 * Created by sen on 16-5-28.
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}