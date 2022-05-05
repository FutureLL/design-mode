package com.future.observer_pattern.handler.impl.sub;

import com.future.observer_pattern.handler.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: lilei58
 * @Date: Created in 2022/5/5 上午8:29
 */
public class Subject {

    private List<Observer> observers = new ArrayList<>();

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }

}
