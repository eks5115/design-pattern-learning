package com.xrotor.action.observer;

import java.util.Observable;
import java.util.Observer;

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
