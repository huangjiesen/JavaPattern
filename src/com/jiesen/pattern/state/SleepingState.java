package com.jiesen.pattern.state;

/**
 * Created by sen on 16-6-6.
 */
public class SleepingState extends State{
    @Override
    void writeProgram(Work work) {
        System.out.println("当前时间:"+ work.getHour()+",不行了，睡觉了！");
    }
}
