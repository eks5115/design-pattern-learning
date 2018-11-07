package com.xrotor.design.pattern.struct.proxy;

import org.junit.Test;

/**
 * @author eks5115
 */
public class ProxyTest {
    @Test
    public void mainTest() {
        Image image = new ProxyImage("10.jpg");

        image.display();
        System.out.println("");

        image.display();
    }
}
