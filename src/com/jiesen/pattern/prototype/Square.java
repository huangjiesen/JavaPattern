package com.jiesen.pattern.prototype;

/**
 * Created by sen on 16-5-28.
 */
public class Square extends Shape {
    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
