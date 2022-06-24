package com.future.interpreter_pattern.imterpreter;

/**
 * @Description:
 * @Author: lilei58
 * @Date: Created in 2022/6/24 上午8:08
 */
public interface Expression {

    /**
     * 解释
     * @param context
     * @return
     */
    boolean interpret(String context);
}
