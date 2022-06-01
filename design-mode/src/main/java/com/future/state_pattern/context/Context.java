package com.future.state_pattern.context;

import com.future.state_pattern.state.State;

/**
 * @Description:
 * @Author: lilei58
 * @Date: Created in 2022/6/2 上午7:27
 */
public class Context {

    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }

}
