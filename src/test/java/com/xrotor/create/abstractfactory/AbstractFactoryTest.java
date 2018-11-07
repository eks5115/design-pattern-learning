package com.xrotor.create.abstractfactory;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author eks5115
 */
public class AbstractFactoryTest {

    @Test
    public void test() {
        Factory factory0 = new Factory0();
        Factory factory1 = new Factory1();

        Assert.assertEquals("0-pa", factory0.createProductA().getName());
        Assert.assertEquals("0-pb", factory0.createProductB().getName());

        Assert.assertEquals("1-pa", factory1.createProductA().getName());
        Assert.assertEquals("1-pb", factory1.createProductB().getName());
    }
}
