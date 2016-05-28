package com.jiesen.pattern.decorator;

/**
 * Created by sen on 16-5-28.
 */
public class Demo {
    public static void main(String[] args) {
        Person zs = new Person("张三");

        BigTrouser bt = new BigTrouser(zs);
        Sneakers sk = new Sneakers(bt);
        Tshirts ts = new Tshirts(sk);
        System.out.println("第一种装扮：");
        ts.show();

        Finery f = new BigTrouser(new Tshirts(new Sneakers(zs)));
        System.out.println("\n\n第二种装扮：");
        f.show();
    }
}
