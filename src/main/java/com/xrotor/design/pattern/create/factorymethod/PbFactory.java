package com.xrotor.design.pattern.create.factorymethod;

/**
 * @author eks
 * @date 2016/7/24
 */
public class PbFactory implements Factory {
    @Override
    public Product createProduct() {
        return new PbProduct();
    }
}