package com.xrotor.design.pattern.action.state;

import sun.jvm.hotspot.utilities.Assert;

/**
 * @author eks5115
 */
public class Context {

    private State state;

    public void require() {
        assert state != null;
        state.handle();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
