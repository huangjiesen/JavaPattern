package com.jiesen.pattern.observer;

/**
 * Created by sen on 16-6-6.
 */
public class Octal extends Observer {

    public Octal(Subject subject) {
        super.subject = subject;
        subject.attach(this);
    }

    @Override
    void update() {
        System.out.println("八进制类接到通知，状态：" + subject.getState() + ",转八进制：" + Integer.toOctalString(subject.getState()));
    }
}
