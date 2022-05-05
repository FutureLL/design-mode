package com.future.strategy_pattern.abstractWay.handler.impl;

import com.future.strategy_pattern.abstractWay.handler.AbstractStrategyHandler;
import org.springframework.stereotype.Component;

/**
 * @Description: 操作减法
 * @Author: lilei58
 * @Date: Created in 2022/5/4 下午9:36
 */
@Component
public class AbstractSubtractHandler extends AbstractStrategyHandler {

    @Override
    public boolean isMatch(String type) {
        return "-".equals(type);
    }

    @Override
    public int doMatch(int num1, int num2) {
        return num1 - num2;
    }
}
