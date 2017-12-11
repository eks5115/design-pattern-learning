package com.xrotor.action.observer;

/**
 * Created by eks5115 on 27/09/2017.
 */
public class ObserverDemo {
    public static void main(String [] args) {
        Subject subject = new ConcreteSubject();
        subject.setState("OK");
        Observer observer = new ConcreteObserver(subject);
        subject.notify_();
    }
}
