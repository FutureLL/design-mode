package com.future.builder_pattern.builder;

/**
 * @Description:
 * @Author: lilei58
 * @Date: Created in 2022/6/8 上午8:17
 */
public abstract class ComputerBuilder {

    protected Computer computer;

    public Computer getComputer() {
        return computer;
    }

    public void buildComputer() {
        computer = new Computer();
        System.out.println("生成了一台电脑！！！");
    }

    public abstract void buildMaster();

    public abstract void buildScreen();

    public abstract void buildKeyboard();

    public abstract void buildMouse();

    public abstract void buildAudio();

}
