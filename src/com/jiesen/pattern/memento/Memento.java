package com.jiesen.pattern.memento;

/**
 * Created by sen on 16-6-7.
 */
public class Memento {
    private String state;
    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
