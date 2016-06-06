package com.jiesen.pattern.template;

/**
 * Created by sen on 16-6-6.
 */
public class Cricket extends Game {
    @Override
    void init() {
        System.out.println("板球游戏：初始中。。。");
    }

    @Override
    void start() {
        System.out.println("板球游戏：开始游戏，请享受吧。。。");
    }

    @Override
    void end() {
        System.out.println("板球游戏：结束了。。。");
    }
}
