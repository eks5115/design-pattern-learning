package com.xrotor.design.pattern.action.observer;

/**
 *
 * @author eks5115
 */
public interface Subject {
    /**
     * set state
     * @param state
     */
    void setState(String state);

    /**
     * get state
     * @return
     */
    String getState();

}
