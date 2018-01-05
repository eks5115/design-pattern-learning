package com.xrotor.action.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eks5115
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

    @Override
    public void notifyObserver() {
        for (Observer observer:observerList) {
            observer.update(this);
        }
    }
}
