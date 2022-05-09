package com.future.decorator_pattern.handler.impl.decorator;

import com.future.decorator_pattern.handler.Shape;

/**
 * @Description: 继承装饰者
 * @Author: lilei58
 * @Date: Created in 2022/5/9 上午8:23
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("RedShapeDecorator Color: Red");
    }

}