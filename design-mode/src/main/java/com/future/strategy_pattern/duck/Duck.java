package com.future.strategy_pattern.duck;

import com.future.strategy_pattern.behavior.flybehavior.FlyBehavior;
import com.future.strategy_pattern.behavior.quackbehavior.QuackBehavior;

/**
 * 策略模式:
 *  分别封装行为接口,实现算法族,超类里放行为接口对象,在子类里具体设定行为对象。
 *  原则就是: 分离变化部分,封装接口,基于接口编程各种功能。
 *  此模式让行为算法的变化独立于算法的使用者。
 *
 * @Description:
 * @Author: lilei58
 * @Date: Created in 2022/4/27 上午8:47
 */
public abstract class Duck {

    /** fly 行为定义 */
    FlyBehavior mFlyBehavior;
    /** quack 行为定义 */
    QuackBehavior mQuackBehavior;

    public Duck() {
    }

    public void fly() {
        mFlyBehavior.fly();
    }

    public void quack() {
        mQuackBehavior.quack();
    }

    /**
     * 游泳
     */
    public void swim() {
        System.out.println("~~im swim~~");
    }

    /**
     * 显示
     */
    public abstract void display();
}
