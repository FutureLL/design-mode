package com.future.facade_pattern.facade.impl;

import com.future.facade_pattern.facade.Shape;

/**
 * @Description:
 * @Author: lilei58
 * @Date: Created in 2022/5/23 下午10:25
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }

}