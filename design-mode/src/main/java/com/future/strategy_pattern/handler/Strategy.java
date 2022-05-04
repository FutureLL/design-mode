package com.future.strategy_pattern.handler;

/**
 * @Description: 创建接口
 * @Author: lilei58
 * @Date: Created in 2022/5/4 下午9:05
 */
public interface Strategy {

    /**
     * 执行操作
     *
     * @param num1
     * @param num2
     * @return
     */
    int doOperation(int num1, int num2);

}
