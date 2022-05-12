package com.future.abstract_factory_pattern.handler.impl.factory;

import com.future.abstract_factory_pattern.handler.Color;
import com.future.abstract_factory_pattern.handler.Shape;
import com.future.abstract_factory_pattern.handler.abs.AbstractFactory;
import com.future.abstract_factory_pattern.handler.impl.shape.Circle;
import com.future.abstract_factory_pattern.handler.impl.shape.Rectangle;
import com.future.abstract_factory_pattern.handler.impl.shape.Square;

/**
 * @Description:
 * @Author: lilei58
 * @Date: Created in 2022/5/12 上午8:22
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){
        if(shapeType == null || "".equals(shapeType)){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}