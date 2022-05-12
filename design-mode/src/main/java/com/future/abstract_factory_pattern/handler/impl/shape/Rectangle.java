package com.future.abstract_factory_pattern.handler.impl.shape;

import com.future.abstract_factory_pattern.handler.Shape;

/**
 * @Description:
 * @Author: lilei58
 * @Date: Created in 2022/5/11 上午9:03
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
