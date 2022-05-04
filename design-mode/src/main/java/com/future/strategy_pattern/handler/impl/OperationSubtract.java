package com.future.strategy_pattern.handler.impl;

import com.future.strategy_pattern.handler.Strategy;

/**
 * @Description: 操作减法
 * @Author: lilei58
 * @Date: Created in 2022/5/4 下午9:07
 */
public class OperationSubtract implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}