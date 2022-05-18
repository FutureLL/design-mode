package com.future.adapter_pattern.handler.impl;

import com.future.adapter_pattern.handler.AdvancedMediaPlayer;

/**
 * @Description: 创建实现了 AdvancedMediaPlayer 接口的实体类
 * @Author: lilei58
 * @Date: Created in 2022/5/18 上午7:57
 */
public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        // 什么也不做
    }
}