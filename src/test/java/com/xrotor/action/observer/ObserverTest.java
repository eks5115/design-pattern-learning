package com.xrotor.action.observer;

import org.junit.Test;

import java.util.Observable;

/**
 * @author eks5115
 * @date 11/12/2017
 */
public class ObserverTest {
    @Test
    public void test() {
        Subject subject = new ConcreteSubject();
        subject.setState("OK");

        ConcreteObservable observable = new ConcreteObservable();
        observable.addObserver(new ConcreteObserver());

        observable.dispatcher(subject);
    }
}
