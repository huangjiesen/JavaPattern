package com.jiesen.pattern.facade;

/**
 * Created by sen on 16-6-6.
 */
public class Demo {
    public static void main(String[] args) {
        //在这里不需要知道Shape,Circle,Rectangle等组件。
        FacadeShape fs = new FacadeShape();

        fs.drawCircle();
        fs.drawRectangle();
        fs.drawSquare();
    }
}
