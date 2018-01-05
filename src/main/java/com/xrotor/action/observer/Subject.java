package com.xrotor.action.observer;

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

    /**
     * add observer
     * @param observer
     */
    void attach(Observer observer);

    /**
     * remove observer
     * @param observer
     * @return
     */
    boolean detach(Observer observer);

    /**
     * notify observer
     */
    void notifyObserver();


}
