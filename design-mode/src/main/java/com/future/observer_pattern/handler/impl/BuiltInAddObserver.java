package com.future.observer_pattern.handler.impl;

import java.util.Observable;
import java.util.Observer;

/**
 * @Description: Java 内置观察者 - 二进制
 * @Author: lilei58
 * @Date: Created in 2022/5/6 上午9:23
 */
public class BuiltInAddObserver implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        Integer index = (Integer) arg;
        System.out.println("Built In Binary String: " + Integer.toOctalString(index));
    }
}
