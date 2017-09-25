package com.x_rotor.action.strategy;

/**
 * Created by eks5115 on 2017/1/3.
 */
public class StrategyDemo {
    public static void main(String[] args) {
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
