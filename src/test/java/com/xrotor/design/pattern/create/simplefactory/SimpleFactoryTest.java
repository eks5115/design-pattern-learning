package com.xrotor.design.pattern.create.simplefactory;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author eks5115
 * @date 11/12/2017
 */
public class SimpleFactoryTest {
    @Test
    public void mainTest() {
        Product product;
        product = Factory.getProduct(Product.A);
        assertEquals("Simple Factory product name",Product.A, product.getName());
    }
}
