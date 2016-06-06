package com.jiesen.pattern.observer;

/**
 * Created by sen on 16-6-6.
 */
public interface Subject {
    int getState();
    void setState(int state);
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObserver();
}
