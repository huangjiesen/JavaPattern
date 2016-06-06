package com.jiesen.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sen on 16-6-6.
 */
public class Boss implements Subject {
    private List<Observer> obs = new ArrayList<>();
    private int state;

    @Override
    public int getState() {
        return state;
    }

    @Override
    public void setState(int state) {
        this.state = state;
        notifyObserver();
    }

    @Override
    public void attach(Observer observer) {
        obs.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        obs.remove(observer);
    }

    @Override
    public void notifyObserver() {
        System.out.println("老板新自执行通知：");
        for (Observer o : obs) {
            o.update();
        }
    }
}
