package com.future.strategy_pattern.oo;

/**
 * 超类挖的一个坑,每个子类都要来填,增加工作量,复杂度O(N^2),不是好的设计方式
 *
 * @Description: 石头鸭
 * @Author: lilei58
 * @Date: Created in 2022/4/27 上午8:53
 */
public class StoneDuck extends Duck {

	@Override
	public void display() {
		System.out.println("**StoneDuck**");
	}

	@Override
	public void quack() {
		System.out.println("~~no gaga~~");
	}

	@Override
	public void swim() {
		System.out.println("~~no swim~~");
	}
	
	@Override
	public void fly() {
		System.out.println("~~no fly~~");
	}
}
