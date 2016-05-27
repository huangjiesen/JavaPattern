package com.jiesen.pattern.decorator;

/**
 * Created by sen on 16-5-25.
 */
public class Person {
    private String name;

    public Person() {
        super();
    }

    public Person(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("装扮的" + name);
    }
}
