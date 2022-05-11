package com.future.simple_factory.handler.factory;

import com.future.simple_factory.handler.Shape;
import com.future.simple_factory.handler.impl.Circle;
import com.future.simple_factory.handler.impl.Rectangle;
import com.future.simple_factory.handler.impl.Square;

/**
 * @Description:
 * @Author: lilei58
 * @Date: Created in 2022/5/11 上午9:05
 */
public class ShapeFactory {

    /**
     * 使用 getShape 方法获取形状类型的对象
     *
     * @param shapeType
     * @return
     */
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }

}
