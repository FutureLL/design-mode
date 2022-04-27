package com.future.strategy_pattern.oo;

/**
 * @Description: 鸭子抽象类
 * @Author: lilei58
 * @Date: Created in 2022/4/27 上午8:53
 */
public abstract class Duck {

	/**
	 * 嘎嘎叫
	 */
	public void quack() {
		System.out.println("~~gaga~~");
	}

	/**
	 * 游泳
	 */
	public void swim() {
		System.out.println("~~I'm swim~~");
	}

	/**
	 * 飞
	 */
	public void fly() {
		System.out.println("~~I'm fly~~");
	}

	/**
	 * 抽象方法,子类实现
	 */
	public abstract void display();
	
}
