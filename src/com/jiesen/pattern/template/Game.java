package com.jiesen.pattern.template;

/**
 * 模板抽像类
 * <p>定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。
 *  模板方法使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。</p>
 * Created by sen on 16-6-6.
 */
public abstract class Game {
    abstract void init();
    abstract void start();
    abstract void end();

    public final void play() {
        init();

        start();

        end();

    }
}
