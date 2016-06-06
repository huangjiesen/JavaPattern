package com.jiesen.pattern.observer;

/**
 * Created by sen on 16-6-6.
 */
public abstract class Observer {
    protected Subject subject;
    abstract void update();
}
