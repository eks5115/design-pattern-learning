package com.xrotor.design.pattern.action.observer;

import java.util.Observable;

/**
 *
 * @author eks5115
 */
public class ConcreteObserver implements java.util.Observer {

    @Override
    public void update(Observable o, Object subject) {
        System.out.println("ConcreteObserver - ConcreteSubject's state is:" + ((ConcreteSubject)subject).getState());
    }
}
