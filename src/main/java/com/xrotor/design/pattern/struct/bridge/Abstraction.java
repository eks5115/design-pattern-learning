package com.xrotor.design.pattern.struct.bridge;

/**
 * @author eks5115
 */
public abstract class Abstraction {

    protected Implementor implementor;

    Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    /**
     * operation
     */
    abstract public void operation();
}
