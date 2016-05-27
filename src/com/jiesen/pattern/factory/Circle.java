package com.jiesen.pattern.factory;

/**
 * 圆形
 * Created by sen on 16-5-20.
 */
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("正在画圆形。。。");
    }
}
