package com.xrotor.design.pattern.create.builder;

/**
 * @author eks5115
 */
public class ConcreteProduct implements Product {

    private String name;

    private int size;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "ConcreteProduct{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
