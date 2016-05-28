package com.jiesen.pattern.decorator;

/**
 * 大裤子
 * Created by sen on 16-5-25.
 */
public class BigTrouser extends Finery {
    public BigTrouser(Person person) {
        super(person);
    }

    @Override
    public void show() {
        System.out.print("大裤子 ");
        super.show();
    }
}
