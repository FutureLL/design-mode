package com.future.abstract_factory_pattern.handler.producer;

import com.future.abstract_factory_pattern.handler.abs.AbstractFactory;
import com.future.abstract_factory_pattern.handler.impl.factory.ColorFactory;
import com.future.abstract_factory_pattern.handler.impl.factory.ShapeFactory;

/**
 * @Description:
 * @Author: lilei58
 * @Date: Created in 2022/5/12 上午8:26
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }

}
