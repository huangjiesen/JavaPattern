package com.jiesen.pattern.factory;

/**
 * 形状工厂
 * Created by sen on 16-5-20.
 */
public class ShapeFactory {
    public Shape getShape(String shapeType) {
        if ("circle".equalsIgnoreCase(shapeType)) {
            return new Circle();
        } else if ("rectangle".equalsIgnoreCase(shapeType)) {
            return new Rectangle();
        }else if ("square".equalsIgnoreCase(shapeType)) {
            return new Square();
        }
        return null;
    }
}
