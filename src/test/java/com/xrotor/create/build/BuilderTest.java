package com.xrotor.create.build;

import com.xrotor.create.builder.AbstractBuilder;
import com.xrotor.create.builder.ConcreteBuilder;
import com.xrotor.create.builder.Product;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author eks5115
 */
public class BuilderTest {

    @Test
    public void test() {
        AbstractBuilder builder = ConcreteBuilder.newBuilder().setName("builder").setSize(10);
        Product product = builder.build();

        Assert.assertEquals("builder", product.getName());
        Assert.assertEquals(10, product.getSize());
    }
}
