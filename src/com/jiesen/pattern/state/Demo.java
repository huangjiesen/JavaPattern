package com.jiesen.pattern.state;

/**
 * Created by sen on 16-6-6.
 */
public class Demo {
    public static void main(String[] args) {
        //Work1 work = new Work1();  //这种方式有大量的if...else语句
        Work work = new Work();      //去除了if...else语句

        work.setHour(9);
        work.writeProgram();
        work.setHour(10);
        work.writeProgram();
        work.setHour(12);
        work.writeProgram();
        work.setHour(13);
        work.writeProgram();
        work.setHour(14);
        work.writeProgram();
        work.setHour(17);


        work.setFinish(true);
        //work.setFinish(false);

        work.writeProgram();
        work.setHour(19);
        work.writeProgram();
        work.setHour(22);
        work.writeProgram();
    }
}
