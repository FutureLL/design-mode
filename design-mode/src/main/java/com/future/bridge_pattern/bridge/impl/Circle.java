package com.future.bridge_pattern.bridge.impl;

import com.future.bridge_pattern.bridge.DrawAPI;
import com.future.bridge_pattern.bridge.abs.Shape;

/**
 * @Description:
 * @Author: lilei58
 * @Date: Created in 2022/6/7 上午8:52
 */
public class Circle extends Shape {

    private int x;

    private int y;

    private int radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}
