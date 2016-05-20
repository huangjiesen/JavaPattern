package com.jiesen.pattern.factory;

/**
 * 示例：通过对象工场获取对象
 * Created by sen on 16-5-20.
 */
public class Demo1 {
    public static void main(String[] args) {
        //获取 Circle 的对象，并调用它的 draw 方法
        Circle circle = ObjectFactory.get(Circle.class);
        //调用 Circle 的 draw 方法
        circle.draw();

        //获取 Rectangle 的对象，并调用它的 draw 方法
        Shape shape2 = ObjectFactory.get(Rectangle.class);
        //调用 Rectangle 的 draw 方法
        shape2.draw();

        //获取 Square 的对象，并调用它的 draw 方法
        Shape shape3 = ObjectFactory.get(Square.class);
        //调用 Square 的 draw 方法
        shape3.draw();
    }
}
