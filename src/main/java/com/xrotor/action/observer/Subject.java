package com.xrotor.action.observer;

/**
 * Created by eks5115 on 27/09/2017.
 */
public interface Subject {
    void setState(String state);
    String getState();

    void attach(Observer observer);
    boolean detach(Observer observer);

    void notify_();


}
