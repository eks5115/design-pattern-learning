package com.xrotor.design.pattern.struct.adapter;

/**
 *
 * @author eks5115
 */
public class Adapter implements Target {

    private Adaptee adaptee;

    /**
     *
     * @param adaptee
     */
    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
