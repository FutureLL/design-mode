package com.future.abstract_factory_pattern.handler.impl.factory;

import com.future.abstract_factory_pattern.handler.Color;
import com.future.abstract_factory_pattern.handler.Shape;
import com.future.abstract_factory_pattern.handler.abs.AbstractFactory;
import com.future.abstract_factory_pattern.handler.impl.color.Blue;
import com.future.abstract_factory_pattern.handler.impl.color.Green;
import com.future.abstract_factory_pattern.handler.impl.color.Red;

/**
 * @Description:
 * @Author: lilei58
 * @Date: Created in 2022/5/12 上午8:23
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){
        return null;
    }

    @Override
    public Color getColor(String color) {
        if(color == null || "".equals(color)){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }
}