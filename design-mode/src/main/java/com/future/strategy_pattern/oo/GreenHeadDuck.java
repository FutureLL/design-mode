package com.future.strategy_pattern.oo;

/**
 * @Description: 绿头鸭
 * @Author: lilei58
 * @Date: Created in 2022/4/27 上午8:53
 */
public class GreenHeadDuck extends Duck {

	/**
	 * 名称展示 - 子类实现
	 */
	@Override
	public void display() {
		System.out.println("**GreenHead**");
	}

	/**
	 * 继续尝试用OO原理来解决,覆盖
	 * 是否会飞 - 子类代替父类实现
	 */
	@Override
	public void fly() {
		System.out.println("~~no fly~~");
	}

}
