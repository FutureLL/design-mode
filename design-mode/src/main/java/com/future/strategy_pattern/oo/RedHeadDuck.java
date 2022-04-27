package com.future.strategy_pattern.oo;

/**
 * @Description: 红头鸭
 * @Author: lilei58
 * @Date: Created in 2022/4/27 上午8:53
 */
public class RedHeadDuck extends Duck {

	/**
	 * 名称展示 - 子类实现
	 */
	@Override
	public void display() {
		System.out.println("**RedHead**");
	}

}
