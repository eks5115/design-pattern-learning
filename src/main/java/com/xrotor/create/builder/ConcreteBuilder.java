package com.xrotor.create.builder;

/**
 * @author eks5115
 */
public class ConcreteBuilder extends AbstractBuilder {

    private ConcreteBuilder() {

    }

    public static AbstractBuilder newBuilder() {
        return new ConcreteBuilder();
    }

    @Override
    public Product build() {
        Product product = new ConcreteProduct();

        product.setName(this.name);
        product.setSize(this.size);

        return product;
    }
}
