package com.future.strategy_pattern.duck;

import com.future.strategy_pattern.behavior.flybehavior.GoodFlyBehavior;
import com.future.strategy_pattern.behavior.quackbehavior.GaGaQuackBehavior;

/**
 * @Description:
 * @Author: lilei58
 * @Date: Created in 2022/4/27 上午8:48
 */
public class GreenHeadDuck extends Duck {

    public GreenHeadDuck() {
        mFlyBehavior = new GoodFlyBehavior();
        mQuackBehavior = new GaGaQuackBehavior();
    }

    @Override
    public void display() {
        System.out.println("**GreenHead**");
    }

}
