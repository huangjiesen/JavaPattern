package com.jiesen.pattern.state;

/**
 * Created by sen on 16-6-6.
 */
public class Work {
    private int hour;
    private boolean finish;
    private State state;

    public Work() {
        state = new ForenoonState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void writeProgram() {
        this.state.writeProgram(this);
    }


    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }
}
