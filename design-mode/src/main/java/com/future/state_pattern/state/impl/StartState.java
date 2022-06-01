package com.future.state_pattern.state.impl;

import com.future.state_pattern.context.Context;
import com.future.state_pattern.state.State;

/**
 * @Description:
 * @Author: lilei58
 * @Date: Created in 2022/6/2 上午7:27
 */
public class StartState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    @Override
    public String toString(){
        return "Start State";
    }

}
