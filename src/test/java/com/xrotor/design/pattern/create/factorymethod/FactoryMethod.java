package com.xrotor.design.pattern.create.factorymethod;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author eks5115
 * @date 11/12/2017
 */
public class FactoryMethod {
    @Test
    public void paTest() {
        Factory factory = null;
        Product product = null;

        factory = new PaFactory();
        product = factory.createProduct();
        assertEquals("FactoryMethod product A",Product.A, product.getName());
    }

    @Test
    public void pbTest() {
        Factory factory = null;
        Product product = null;

        factory = new PbFactory();
        product = factory.createProduct();
        assertEquals("FactoryMethod product B",Product.B, product.getName());
    }
}
