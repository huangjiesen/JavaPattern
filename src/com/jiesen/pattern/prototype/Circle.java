package com.jiesen.pattern.prototype;

/**
 * Created by sen on 16-5-28.
 */
public class Circle extends Shape {
    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
