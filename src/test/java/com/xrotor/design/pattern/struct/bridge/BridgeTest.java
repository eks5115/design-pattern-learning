package com.xrotor.design.pattern.struct.bridge;

import org.junit.Test;

/**
 * @author eks5115
 */
public class BridgeTest {

    @Test
    public void mainTest() {
        Implementor implementor = new ConcreteImplementorA();
        Abstraction abstraction = new RefinedAbstraction(implementor);
        abstraction.operation();

        implementor = new ConcreteImplementorB();
        abstraction = new RefinedAbstraction(implementor);
        abstraction.operation();
    }
}
