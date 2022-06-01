package com.future.state_pattern.state.impl;

import com.future.state_pattern.context.Context;
import com.future.state_pattern.state.State;

/**
 * @Description:
 * @Author: lilei58
 * @Date: Created in 2022/6/2 上午7:28
 */
public class StopState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    @Override
    public String toString(){
        return "Stop State";
    }
}
