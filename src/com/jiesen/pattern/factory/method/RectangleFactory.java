package com.jiesen.pattern.factory.method;

import com.jiesen.pattern.factory.Rectangle;
import com.jiesen.pattern.factory.Shape;

/**
 * Created by sen on 16-6-6.
 */
public class RectangleFactory implements ShapeFactory {
    @Override
    public Shape getShape() {
        return new Rectangle();
    }
}
