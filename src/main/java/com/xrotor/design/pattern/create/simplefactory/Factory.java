package com.xrotor.design.pattern.create.simplefactory;

/**
 * @author eks5115
 * @date 11/12/2017
 */
public class Factory {
    public static Product getProduct(String productName) {
        Product product = null;
        if (productName.equals(Product.A)) {
            product = new PaProduct();
        } else if (productName.equals(Product.B)) {
            product = new PbProduct();
        } else {

        }
        return product;
    }
}
