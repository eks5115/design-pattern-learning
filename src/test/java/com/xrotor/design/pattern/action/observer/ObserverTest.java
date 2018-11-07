package com.xrotor.design.pattern.action.observer;

import org.junit.Test;

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
