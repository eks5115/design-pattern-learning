package com.xrotor.design.pattern.create.builder;

/**
 * @author eks5115
 */
public abstract class AbstractBuilder implements Builder {

    protected String name;

    protected int size;

    public AbstractBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public AbstractBuilder setSize(int size) {
        this.size = size;
        return this;
    }
}
