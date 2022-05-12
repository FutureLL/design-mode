package com.future.abstract_factory_pattern.handler.abs;

import com.future.abstract_factory_pattern.handler.Color;
import com.future.abstract_factory_pattern.handler.Shape;

/**
 * @Description:
 * @Author: lilei58
 * @Date: Created in 2022/5/12 上午8:21
 */
public abstract class AbstractFactory {

    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);

}
