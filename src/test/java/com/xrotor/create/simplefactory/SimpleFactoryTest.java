package com.xrotor.create.simplefactory;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author eks5115
 * @date 11/12/2017
 */
public class SimpleFactoryTest {
    @Test
    public void mainTest() {
        Product product = null;
        product = Factory.getProduct(Product.A);
        assertEquals("Simple Factory product name",Product.A, product.getName());
    }
}
