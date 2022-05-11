package com.future.simple_factory.handler.impl;

import com.future.simple_factory.handler.Shape;

/**
 * @Description:
 * @Author: lilei58
 * @Date: Created in 2022/5/11 上午9:04
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}