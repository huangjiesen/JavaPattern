package com.jiesen.pattern.proxy;

/**
 * Created by sen on 16-5-30.
 */
public class Demo {
    public static void main(String[] args) {
        Image image = new ProxyImage("text.png");
        image.display();

        //图像将无法从磁盘加载，而是直接显示图片
        image.display();
    }
}
