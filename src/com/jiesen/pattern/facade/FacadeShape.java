package com.jiesen.pattern.facade;

/**
 * Created by sen on 16-6-6.
 */
public class FacadeShape {
    private Circle circle;
    private Rectangle rectangle;
    private Square square;

    public FacadeShape() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}
