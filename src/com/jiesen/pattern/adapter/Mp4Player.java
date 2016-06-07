package com.jiesen.pattern.adapter;

/**
 * Created by sen on 16-6-7.
 */
public class Mp4Player implements AdvancdMediaPlayer{
    @Override
    public void playMp4(String fileName) {
        System.out.println("正在播放MP4媒体文件:"+fileName);
    }

    @Override
    public void playVlc(String fileName) {
        //什么也不做
    }
}
