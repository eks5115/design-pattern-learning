package com.xrotor.design.pattern.struct.proxy;

import org.junit.Test;

/**
 * @author eks5115
 */
public class ProxyTest {
    @Test
    public void mainTest() {
        Image image = new ProxyImage("0.jpg");

        image.display();
    }
}
