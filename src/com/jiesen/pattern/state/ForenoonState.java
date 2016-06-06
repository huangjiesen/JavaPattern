package com.jiesen.pattern.state;

/**
 * 上午工作状态
 * Created by sen on 16-6-6.
 */
public class ForenoonState extends State {
    @Override
    void writeProgram(Work work) {
        if (work.getHour() < 12) {
            System.out.println("当前时间:" + work.getHour() + ",上午工作、精神百倍！");
        } else {
            work.setState(new NoonState());
            work.writeProgram();
        }
    }
}
