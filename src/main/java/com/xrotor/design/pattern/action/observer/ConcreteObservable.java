package com.xrotor.design.pattern.action.observer;

import java.util.Observable;

/**
 *
 * @author eks5115
 */
public class ConcreteObservable extends Observable implements Dispatcher {

    @Override
    public void dispatcher(Subject subject) {
        setChanged();
        notifyObservers(subject);
    }
}
