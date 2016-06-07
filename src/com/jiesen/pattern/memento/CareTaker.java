package com.jiesen.pattern.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sen on 16-6-7.
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
