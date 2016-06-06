package com.jiesen.pattern.state;

/**
 * Created by sen on 16-6-6.
 */
public class AftornoonState extends State{
    @Override
    void writeProgram(Work work) {
        if (work.getHour() < 12) {
            System.out.println("当前时间:"+ work.getHour()+",下午状态还不错，继续努力");
        } else {
            work.setState(new EveningState());
            work.writeProgram();
        }
    }
}
