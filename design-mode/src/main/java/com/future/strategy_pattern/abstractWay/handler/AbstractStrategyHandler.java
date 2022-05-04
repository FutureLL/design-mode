package com.future.strategy_pattern.abstractWay.handler;

/**
 * @Description:
 * @Author: lilei58
 * @Date: Created in 2022/5/4 下午9:34
 */
public abstract class AbstractStrategyHandler {

    /**
     * 匹配枚举
     *
     * @param type
     * @return
     */
    public abstract boolean isMatch(String type);

    /**
     * 执行匹配的枚举
     *
     * @param num1
     * @param num2
     * @return
     */
    public abstract int doMatch(int num1, int num2);

}
