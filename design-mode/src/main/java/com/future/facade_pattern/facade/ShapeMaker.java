package com.future.facade_pattern.facade;

import com.future.facade_pattern.facade.impl.Circle;
import com.future.facade_pattern.facade.impl.Rectangle;
import com.future.facade_pattern.facade.impl.Square;

/**
 * @Description:
 * @Author: lilei58
 * @Date: Created in 2022/5/23 下午10:26
 */
public class ShapeMaker {

    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }

    public void drawRectangle(){
        rectangle.draw();
    }

    public void drawSquare(){
        square.draw();
    }

}