package com.future.builder_pattern.builder;

/**
 * @Description: 电脑类
 * @Author: lilei58
 * @Date: Created in 2022/6/8 上午8:17
 */
public class Computer {

    public String master;

    public String screen;

    public String keyboard;

    public String mouse;

    public String audio;

    public void setMaster(String master) {
        this.master = master;
    }
    public void setScreen(String screen) {
        this.screen = screen;
    }
    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }
    public void setMouse(String mouse) {
        this.mouse = mouse;
    }
    public void setAudio(String audio) {
        this.audio = audio;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "master='" + master + '\'' +
                ", screen='" + screen + '\'' +
                ", keyboard='" + keyboard + '\'' +
                ", mouse='" + mouse + '\'' +
                ", audio='" + audio + '\'' +
                '}';
    }
}
