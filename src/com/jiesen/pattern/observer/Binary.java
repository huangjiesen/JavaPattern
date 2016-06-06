package com.jiesen.pattern.observer;

/**
 * Created by sen on 16-6-6.
 */
public class Binary extends Observer {

    public Binary(Subject subject) {
        super.subject = subject;
        subject.attach(this);
    }

    @Override
    void update() {
        System.out.println("二进制类接到通知，状态：" + subject.getState() + ",转二进制：" + Integer.toBinaryString(subject.getState()));
    }
}
