package com.future.observer_pattern.handler;

import com.future.observer_pattern.handler.impl.sub.Subject;

/**
 * @Description:
 * @Author: lilei58
 * @Date: Created in 2022/5/5 上午8:28
 */
public abstract class Observer {

    /**
     * 定义观察者
     */
    protected Subject subject;

    /**
     * 更新
     */
    public abstract void update();
}
