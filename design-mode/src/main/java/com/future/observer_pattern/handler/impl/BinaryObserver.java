package com.future.observer_pattern.handler.impl;

import com.future.observer_pattern.handler.Observer;
import com.future.observer_pattern.handler.impl.sub.Subject;

/**
 * @Description: 二进制
 * @Author: lilei58
 * @Date: Created in 2022/5/5 上午8:29
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: " + Integer.toOctalString(subject.getState()));
    }

}
