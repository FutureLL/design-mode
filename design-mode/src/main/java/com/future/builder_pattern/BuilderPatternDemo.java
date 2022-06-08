package com.future.builder_pattern;

import com.future.builder_pattern.builder.Computer;
import com.future.builder_pattern.builder.impl.HpComputerBuilder;
import com.future.builder_pattern.director.Director;

/**
 * @Description: TODO 生成器模式（Builder Pattern）
 * @Author: lilei58
 * @Date: Created in 2022/6/8 上午8:15
 *
 * 生成器模式的核心是"当构建生成一个对象的时候,需要包含多个步骤,虽然每个步骤具体的实现不同,但是都遵循一定的流程与规则"
 */
public class BuilderPatternDemo {

    public static void main(String[] args) {

        Director director = new Director();

        // 构建惠普电脑
        director.setComputerBuilder(new HpComputerBuilder());
        // 组装电脑
        director.constructComputer();

        // 得到一台电脑
        Computer pc = director.getComputer();
        System.out.println(pc.toString());
    }

}
