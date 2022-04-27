package com.future.strategy_pattern.oo;

/**
 * OO原则解决需求:
 * OO七大原则为: 单一职责原则,开闭原则,里氏替换原则,依赖倒置原则,接口隔离原则,合成/聚合复用原则,迪米特法则
 * https://blog.csdn.net/ql15010832315/article/details/53127724
 *
 * @Description:
 * @Author: lilei58
 * @Date: Created in 2022/4/27 上午8:53
 */
public class StimulateDuck {

	public static void main(String[] args) {

		GreenHeadDuck mGreenHeadDuck = new GreenHeadDuck();
		RedHeadDuck mRedHeadDuck = new RedHeadDuck();

		mGreenHeadDuck.display();
		mGreenHeadDuck.fly();
		mGreenHeadDuck.quack();
		mGreenHeadDuck.swim();

		mRedHeadDuck.display();
		
		mRedHeadDuck.quack();
		mRedHeadDuck.swim();
		mRedHeadDuck.fly();
		

		mGreenHeadDuck.fly();
		mRedHeadDuck.fly();
	}

}
