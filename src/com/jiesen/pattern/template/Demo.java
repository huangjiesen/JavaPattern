package com.jiesen.pattern.template;

/**
 * 模板抽像类
 * Created by sen on 16-6-6.
 */
public class Demo {
    public static void main(String[] args) {
        Game cricket = new Cricket();
        cricket.play();

        Game football = new Football();
        football.play();
    }
}
