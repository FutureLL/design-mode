package com.future.bridge_pattern.bridge.abs;

import com.future.bridge_pattern.bridge.DrawAPI;

/**
 * @Description: 使用 DrawAPI 接口创建抽象类 Shape
 * @Author: lilei58
 * @Date: Created in 2022/6/7 上午8:51
 */
public abstract class Shape {

    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
