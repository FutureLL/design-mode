package com.future.strategy_pattern.behavior.flybehavior;

/**
 * @Description:
 * @Author: lilei58
 * @Date: Created in 2022/4/27 上午8:53
 */
public class BadFlyBehavior implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("--BadFly--");
	}
}
