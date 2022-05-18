package com.future.adapter_pattern.handler;

/**
 * @Description: 为媒体播放器和更高级的媒体播放器创建接口
 * @Author: lilei58
 * @Date: Created in 2022/5/18 上午7:55
 */
public interface AdvancedMediaPlayer {

    /**
     * vlc
     *
     * @param fileName
     */
    public void playVlc(String fileName);

    /**
     * mp4
     *
     * @param fileName
     */
    public void playMp4(String fileName);

}
