package com.jiesen.pattern.decorator;

/**
 * 休闲服饰
 * Created by sen on 16-5-25.
 */
public class Tshirts extends Finery{
    public Tshirts(Person person) {
        super(person);
    }

    @Override
    public void show() {
        System.out.print("休闲服饰 ");
        super.show();
    }
}
