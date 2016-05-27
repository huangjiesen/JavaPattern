package com.jiesen.pattern.factory;

/**
 * 示例：通过工场获取对象
 * Created by sen on 16-5-20.
 */
public class Demo {
    public static void main(String[] args) {
        //创建工厂对象
        ShapeFactory sf = new ShapeFactory();

        //获取 Circle 的对象，并调用它的 draw 方法
        Shape shape1 = sf.getShape("circle");
        //调用 Circle 的 draw 方法
        shape1.draw();

        //获取 Rectangle 的对象，并调用它的 draw 方法
        Shape shape2 = sf.getShape("rectangle");
        //调用 Rectangle 的 draw 方法
        shape2.draw();

        //获取 Square 的对象，并调用它的 draw 方法
        Shape shape3 = sf.getShape("square");
        //调用 Square 的 draw 方法
        shape3.draw();
    }
}
