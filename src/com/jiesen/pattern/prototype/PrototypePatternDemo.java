package com.jiesen.pattern.prototype;

/**
 * Created by sen on 16-5-28.
 */
public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = ShapeCache.getShape("1");
        clonedShape.type = "change this shape";
        System.out.println("Shape : " + clonedShape.getType());
        System.out.println("Cloning has changed its shape : " + ShapeCache.getShape("1").getType());


        Shape clonedShape2 = ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 =  ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }
}
