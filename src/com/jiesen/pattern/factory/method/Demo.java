package com.jiesen.pattern.factory.method;

import com.jiesen.pattern.factory.Shape;

/**
 * Created by sen on 16-6-6.
 */
public class Demo {
    public static void main(String[] args) {
        ShapeFactory sf = new CircleFactory();
        Shape shape = sf.getShape();
        shape.draw();

        ShapeFactory sf1 = new SquareFactory();
        Shape shape1 = sf1.getShape();
        shape1.draw();

        ShapeFactory sf2 = new RectangleFactory();
        Shape shape2 = sf2.getShape();
        shape2.draw();
    }
}
