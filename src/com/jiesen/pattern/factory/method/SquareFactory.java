package com.jiesen.pattern.factory.method;

import com.jiesen.pattern.factory.Shape;
import com.jiesen.pattern.factory.Square;

/**
 * Created by sen on 16-6-6.
 */
public class SquareFactory implements ShapeFactory {
    @Override
    public Shape getShape() {
        return new Square();
    }
}
