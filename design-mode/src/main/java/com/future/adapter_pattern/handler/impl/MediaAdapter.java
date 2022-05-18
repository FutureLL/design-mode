package com.future.adapter_pattern.handler.impl;

import com.future.adapter_pattern.handler.AdvancedMediaPlayer;
import com.future.adapter_pattern.handler.MediaPlayer;

/**
 * @Description: 创建实现了 MediaPlayer 接口的适配器类
 * @Author: lilei58
 * @Date: Created in 2022/5/18 上午7:58
 */
public class MediaAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equals("vlc")) {
            advancedMusicPlayer = new VlcPlayer();
        } else if (audioType.equals("mp4")) {
            advancedMusicPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equals("vlc")) {
            advancedMusicPlayer.playVlc(fileName);
        } else if (audioType.equals("mp4")) {
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}
