package com.future.strategy_pattern.context;

import com.future.strategy_pattern.handler.Strategy;

/**
 * @Description:
 * @Author: lilei58
 * @Date: Created in 2022/5/4 下午9:11
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}