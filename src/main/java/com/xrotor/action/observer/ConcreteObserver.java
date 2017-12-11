package com.xrotor.action.observer;

/**
 * Created by eks5115 on 27/09/2017.
 */
public class ConcreteObserver implements Observer {

    private Subject subject;
    public ConcreteObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update(Subject subject) {
        System.out.println("ConcreteObserver - ConcreteSubject's state is:" + subject.getState());
    }
}
