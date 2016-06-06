package com.jiesen.pattern.state;

/**
 * Created by sen on 16-6-6.
 */
public class NoonState extends State{
    @Override
    void writeProgram(Work work) {
        if (work.getHour() < 12) {
            System.out.println("当前时间:"+ work.getHour()+",饿了，午饭，犯困，午休！");
        } else {
            work.setState(new AftornoonState());
            work.writeProgram();
        }
    }
}
