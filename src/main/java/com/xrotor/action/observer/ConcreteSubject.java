package com.xrotor.action.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by eks5115 on 27/09/2017.
 */
public class ConcreteSubject implements Subject {

    private String state = "";
    private List<Observer> observerList = new ArrayList<>();

    @Override
    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String getState() {
        return state;
    }

    @Override
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public boolean detach(Observer observer) {
        return observerList.remove(observer);
    }

    /**
     *
     */
    @Override
    public void notify_() {
        for (Observer observer:observerList) {
            observer.update(this);
        }
    }
}
