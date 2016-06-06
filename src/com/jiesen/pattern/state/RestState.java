package com.jiesen.pattern.state;

/**
 * Created by sen on 16-6-6.
 */
public class RestState extends State{
    @Override
    void writeProgram(Work work) {
        System.out.println("当前时间:"+work.getHour()+",下班回家了！");
    }
}
