package com.jiesen.pattern.decorator;

/**
 * 运动鞋
 * Created by sen on 16-5-25.
 */
public class Sneakers extends Finery{
    public Sneakers(Person person) {
        super(person);
    }

    @Override
    public void show() {
        System.out.print("运动鞋 ");
        super.show();
    }
}
