package com.future.decorator_pattern.handler.impl.decorator;

import com.future.decorator_pattern.handler.Shape;

/**
 * @Description: 装饰者
 * @Author: lilei58
 * @Date: Created in 2022/5/9 上午8:23
 */
public abstract class ShapeDecorator implements Shape {

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw(){
        decoratedShape.draw();
    }

}