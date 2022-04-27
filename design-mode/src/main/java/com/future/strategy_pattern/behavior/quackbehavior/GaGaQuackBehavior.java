package com.future.strategy_pattern.behavior.quackbehavior;

/**
 * @Description: GaGa叫子类实现
 * @Author: lilei58
 * @Date: Created in 2022/4/27 上午8:53
 */
public class GaGaQuackBehavior implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("__GaGa__");
	}
	
}