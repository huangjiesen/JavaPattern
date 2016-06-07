package com.jiesen.pattern.adapter;

/**
 * Created by sen on 16-6-7.
 */
public class AudioPlayer implements MediaPlayer {
    private MediaAdapter ma;
    @Override
    public void play(String audioType, String fileName) {

        //播放 mp3 音乐文件的内置支持
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("正在播放MP3媒体文件:" + fileName);
        }
        //mediaAdapter 提供了播放其他文件格式的支持
        else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            ma = new MediaAdapter(audioType);
            ma.play(audioType, fileName);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}
