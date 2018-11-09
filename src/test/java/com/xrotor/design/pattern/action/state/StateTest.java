package com.xrotor.design.pattern.action.state;

import org.junit.Test;

/**
 * @author eks5115
 */
public class StateTest {

    @Test
    public void test() {
        Context context = new Context();

        State state = new ConcreteStateA();
        context.setState(state);
        context.require();

        state = new ConcreteStateB();
        context.setState(state);
        context.require();

    }
}
