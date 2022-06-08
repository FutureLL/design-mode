package com.future.builder_pattern.builder.impl;

import com.future.builder_pattern.builder.ComputerBuilder;

/**
 * @Description: 惠普电脑的builder
 * @Author: lilei58
 * @Date: Created in 2022/6/8 上午8:18
 */
public class HpComputerBuilder extends ComputerBuilder {

    @Override
    public void buildMaster() {
        computer.setMaster("i7,16g,512SSD,1060");
        System.out.println("(i7,16g,512SSD,1060)的惠普主机");
    }

    @Override
    public void buildScreen() {
        computer.setScreen("1080p");
        System.out.println("(1080p)的惠普显示屏");
    }

    @Override
    public void buildKeyboard() {
        computer.setKeyboard("cherry 青轴机械键盘");
        System.out.println("(cherry 青轴机械键盘)的键盘");
    }

    @Override
    public void buildMouse() {
        computer.setMouse("MI 鼠标");
        System.out.println("(MI 鼠标)的鼠标");
    }

    @Override
    public void buildAudio() {
        computer.setAudio("飞利浦 音响");
        System.out.println("(飞利浦 音响)的音响");
    }

}
