package com.jiesen.pattern.state;

/**
 * Created by sen on 16-6-6.
 */
public class EveningState extends State{
    @Override
    void writeProgram(Work work) {
        if (work.isFinish()) {
            work.setState(new RestState());
            work.writeProgram();
        } else {
            if (work.getHour() < 21) {
                System.out.println("当前时间:"+ work.getHour()+",加班ing，疲累之极！");
            } else {
                work.setState(new SleepingState());
            }
        }
    }
}
