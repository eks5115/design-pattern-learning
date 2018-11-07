package com.xrotor.design.pattern.struct.adapter;

import org.junit.Test;

/**
 * @author eks5115
 */
public class AdapterTest {
    @Test
    public void mainTest() {
        Target concreteTarget = new ConcreteTarget();
        concreteTarget.request();

        Target adapter = new Adapter(new Adaptee());
        adapter.request();
    }
}
