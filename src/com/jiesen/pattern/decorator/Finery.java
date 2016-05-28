package com.jiesen.pattern.decorator;

/**
 * Created by sen on 16-5-25.
 */
public class Finery extends Person {
    private Person person;

//    public Finery() {
//        super();
//    }
    public Finery(Person person) {
        this.person = person;
    }

    @Override
    public void show() {
        if (person != null)
            person.show();
    }
}
