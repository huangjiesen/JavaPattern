package com.jiesen.pattern.prototype;

/**
 * Created by sen on 16-5-28.
 */
public class Rectangle extends Shape {
    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
