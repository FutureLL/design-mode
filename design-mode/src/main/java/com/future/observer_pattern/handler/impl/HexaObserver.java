package com.future.observer_pattern.handler.impl;

import com.future.observer_pattern.handler.Observer;
import com.future.observer_pattern.handler.impl.sub.Subject;

/**
 * @Description: 十六进制
 * @Author: lilei58
 * @Date: Created in 2022/5/5 上午8:32
 */
public class HexaObserver extends Observer {

    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String: " + Integer.toHexString(subject.getState()).toUpperCase());
    }
}
