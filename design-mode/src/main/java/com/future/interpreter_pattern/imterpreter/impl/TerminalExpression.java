package com.future.interpreter_pattern.imterpreter.impl;

import com.future.interpreter_pattern.imterpreter.Expression;

/**
 * @Description:
 * @Author: lilei58
 * @Date: Created in 2022/6/24 上午8:08
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
