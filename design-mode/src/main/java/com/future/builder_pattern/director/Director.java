package com.future.builder_pattern.director;

import com.future.builder_pattern.builder.Computer;
import com.future.builder_pattern.builder.ComputerBuilder;

/**
 * @Description:
 * @Author: lilei58
 * @Date: Created in 2022/6/8 上午8:20
 */
public class Director {

    private ComputerBuilder computerBuilder;

    public void setComputerBuilder(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public Computer getComputer() {
        return computerBuilder.getComputer();
    }

    public void constructComputer() {
        computerBuilder.buildComputer();
        computerBuilder.buildMaster();
        computerBuilder.buildScreen();
        computerBuilder.buildKeyboard();
        computerBuilder.buildMouse();
        computerBuilder.buildAudio();
    }

}
