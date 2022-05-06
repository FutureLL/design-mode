package com.future.observer_pattern.handler.impl.sub;

import java.util.Observable;
import java.util.Observer;

/**
 * @Description: Java 内置观察者
 * @Author: lilei58
 * @Date: Created in 2022/5/6 上午9:04
 */
public class BuiltInObservable extends Observable {

    private Integer state;

    public BuiltInObservable(Observer observer, Integer state){
        this.state = state;
        this.addObserver(observer);
    }

    public void dataChange() {
        // 用于将此 Observable 对象状态设置为已更改
        // 设置 changed = true
        this.setChanged();
        // 通知,判断 changed 是否为 true,为 true 则通知
        this.notifyObservers(state);
    }

}
