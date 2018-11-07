package com.xrotor.design.pattern.create.abstractfactory;

/**
 * @author eks5115
 */
public class PaProduct implements Product {

    private String name = "Pa";

    public PaProduct(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
