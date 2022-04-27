package com.future.strategy_pattern.behavior.quackbehavior;

/**
 * 好处: 新增行为简单,行为类更好的复用,组合更方便.既有继承带来的复用好处,没有挖坑
 *
 * @Description: 鸭子叫声接口定义
 * @Author: lilei58
 * @Date: Created in 2022/4/27 上午8:53
 */
public interface QuackBehavior {

	/**
	 * 叫
	 */
	void quack();

}