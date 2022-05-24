package com.future.template_pattern.template.impl;

import com.future.template_pattern.template.Game;

/**
 * @Description: 创建扩展了上述类的实体类
 * @Author: lilei58
 * @Date: Created in 2022/5/24 上午7:10
 */
public class Cricket extends Game {

    @Override
    public void endPlay() {
        System.out.println("Cricket Game Finished!");
    }

    @Override
    public void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    public void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }

}
