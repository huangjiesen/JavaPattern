package com.jiesen.pattern.observer;

/**
 * Created by sen on 16-6-6.
 */
public class Hex extends Observer {

    public Hex(Subject subject) {
        super.subject = subject;
        subject.attach(this);
    }

    @Override
    void update() {
        System.out.println("十六进制类接到通知，状态：" + subject.getState() + ",转十六进制：" + Integer.toHexString(subject.getState()));
    }
}
