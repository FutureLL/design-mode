package com.future.decorator_pattern.handler.impl;

import com.future.decorator_pattern.handler.Shape;

/**
 * @Description:
 * @Author: lilei58
 * @Date: Created in 2022/5/9 上午8:21
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }

}