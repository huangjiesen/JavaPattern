package com.jiesen.pattern.adapter;

/**
 * Created by sen on 16-6-7.
 */
public class VlcPlayer implements AdvancdMediaPlayer{
    @Override
    public void playMp4(String fileName) {
        //什么也不做
    }

    @Override
    public void playVlc(String fileName) {
        System.out.println("正在播放VLC媒体文件:"+fileName);
    }
}
