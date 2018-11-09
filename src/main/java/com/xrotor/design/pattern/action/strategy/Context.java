package com.xrotor.design.pattern.action.strategy;

/**
 * Created by eks5115 on 2017/1/3.
 */
public class Context {
    private Strategy strategy;

    public Context() {
    }

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void contextInterface(){
        strategy.algorithmInterface();
    }
}
