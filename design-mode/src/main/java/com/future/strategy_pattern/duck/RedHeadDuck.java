package com.future.strategy_pattern.duck;

import com.future.strategy_pattern.behavior.flybehavior.BadFlyBehavior;
import com.future.strategy_pattern.behavior.quackbehavior.GeGeQuackBehavior;

/**
 * @Description:
 * @Author: lilei58
 * @Date: Created in 2022/4/27 上午8:49
 */
public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        mFlyBehavior = new BadFlyBehavior();
        mQuackBehavior = new GeGeQuackBehavior();
    }

    @Override
    public void display() {
        System.out.println("**RedHead**");
    }

}
