package com.jiesen.pattern.factory.method;

import com.jiesen.pattern.factory.Circle;
import com.jiesen.pattern.factory.Shape;

/**
 * Created by sen on 16-6-6.
 */
public class CircleFactory implements ShapeFactory {
    @Override
    public Shape getShape() {
        return new Circle();
    }
}
