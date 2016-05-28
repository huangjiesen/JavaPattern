package com.jiesen.pattern.builder;

/**
 * 包装瓶子
 * Created by sen on 16-5-28.
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}