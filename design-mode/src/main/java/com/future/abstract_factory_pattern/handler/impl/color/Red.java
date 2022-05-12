package com.future.abstract_factory_pattern.handler.impl.color;

import com.future.abstract_factory_pattern.handler.Color;

/**
 * @Description:
 * @Author: lilei58
 * @Date: Created in 2022/5/12 上午8:19
 */
public class Red implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}