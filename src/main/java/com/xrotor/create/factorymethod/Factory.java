package com.xrotor.create.factorymethod;

/**
 * @author chensen
 */
public interface Factory {

    /**
     * fetch data by rule id
     *
     * @return Product
     */
    Product createProduct();
}