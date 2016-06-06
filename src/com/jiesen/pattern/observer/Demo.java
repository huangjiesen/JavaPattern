package com.jiesen.pattern.observer;

/**
 * Created by sen on 16-6-6.
 */
public class Demo {
    public static void main(String[] args) {
        Subject boss = new Boss();
        new Hex(boss);
        new Octal(boss);
        Binary binary = new Binary(boss);
        System.out.println("First state change: 15");
        boss.setState(15);  //boss类在设置状态后，内部调用执行通知

        System.out.println("Second state change: 10");
        boss.detach(binary);
        boss.setState(10);


        Subject secretary = new Secretary();
        new Octal(secretary);
        new Hex(secretary);
        secretary.setState(20);
        //secretary类在设置状态后，外部调用执行通知。
        secretary.notifyObserver();
    }
}
