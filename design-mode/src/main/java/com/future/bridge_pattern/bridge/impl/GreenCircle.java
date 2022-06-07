package com.future.bridge_pattern.bridge.impl;

import com.future.bridge_pattern.bridge.DrawAPI;

/**
 * @Description: 创建实现了 DrawAPI 接口的实体桥接实现类
 * @Author: lilei58
 * @Date: Created in 2022/6/7 上午8:50
 */
public class GreenCircle implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}