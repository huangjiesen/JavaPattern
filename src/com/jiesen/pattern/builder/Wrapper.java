package com.jiesen.pattern.builder;

/**
 * 包装纸
 * Created by sen on 16-5-28.
 */
public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}