package com.jiesen.pattern.builder;

/**
 * 食物条目和食物包装的接口
 * Created by sen on 16-5-28.
 */
public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
