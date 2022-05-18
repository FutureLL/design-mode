package com.future.adapter_pattern.handler;

/**
 * @Description: 为媒体播放器和更高级的媒体播放器创建接口
 * @Author: lilei58
 * @Date: Created in 2022/5/18 上午7:55
 */
public interface MediaPlayer {

    /**
     * 播放
     *
     * @param audioType
     * @param fileName
     */
    public void play(String audioType, String fileName);

}
