package com.future.observer_pattern.handler.impl;

import com.future.observer_pattern.handler.Observer;
import com.future.observer_pattern.handler.impl.sub.Subject;

/**
 * @Description: 八进制
 * @Author: lilei58
 * @Date: Created in 2022/5/5 上午8:30
 */
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String: " + Integer.toOctalString(subject.getState()));
    }
}
