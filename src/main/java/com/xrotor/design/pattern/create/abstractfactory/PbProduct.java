package com.xrotor.design.pattern.create.abstractfactory;

/**
 * @author eks5115
 */
public class PbProduct implements Product {

    private String name = "Pb";

    public PbProduct(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
