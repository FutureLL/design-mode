package com.future.adapter_pattern.handler.impl;

import com.future.adapter_pattern.handler.AdvancedMediaPlayer;

/**
 * @Description: 创建实现了 AdvancedMediaPlayer 接口的实体类
 * @Author: lilei58
 * @Date: Created in 2022/5/18 上午7:57
 */
public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        // 什么也不做
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }
}