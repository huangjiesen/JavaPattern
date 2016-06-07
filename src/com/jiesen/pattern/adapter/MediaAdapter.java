package com.jiesen.pattern.adapter;

/**
 * Created by sen on 16-6-7.
 */
public class MediaAdapter implements MediaPlayer {

    private AdvancdMediaPlayer amp;

    public MediaAdapter(String audio) {
        if (audio.equalsIgnoreCase("vlc")) {
            amp = new VlcPlayer();
        } else if (audio.equalsIgnoreCase("mp4")) {
            amp = new Mp4Player();
        }
    }

    @Override
    public void play(String audio, String fileName) {
        if (audio.equalsIgnoreCase("vlc")) {
            amp.playVlc(fileName);
        } else if (audio.equalsIgnoreCase("mp4")) {
            amp.playMp4(fileName);
        }
    }
}
