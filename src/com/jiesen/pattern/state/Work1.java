package com.jiesen.pattern.state;

/**
 * Created by sen on 16-6-6.
 */
public class Work1 {
    private int hour;
    private boolean finish;

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


    public void writeProgram() {
        if (hour<12) {
            System.out.println("当前时间:"+hour+",上午工作、精神百倍！");
        } else if (hour<13) {
            System.out.println("当前时间:"+hour+",饿了，午饭，犯困，午休！");
        } else if (hour < 17) {
            System.out.println("当前时间:"+hour+",下午状态还不错，继续努力");
        } else {
            if (finish) {
                System.out.println("当前时间:"+hour+",下班回家了！");
            } else {
                if (hour < 21) {
                    System.out.println("当前时间:"+hour+",加班ing，疲累之极！");
                } else {
                    System.out.println("当前时间:"+hour+",不行了，睡觉了！");
                }
            }
        }
    }
}
