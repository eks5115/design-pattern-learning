package com.xrotor.design.pattern.action.strategy;

import org.junit.Test;

/**
 * @author eks5115
 */
public class StrategyTest {

    @Test
    public void test() {
        ConcreteStrategyA a = new ConcreteStrategyA();
        ConcreteStrategyB b = new ConcreteStrategyB();
        ConcreteStrategyC c = new ConcreteStrategyC();

        Context context = new Context(a);
        context.contextInterface();

        context = new Context(b);
        context.contextInterface();

        context = new Context(c);
        context.contextInterface();
    }
}
