package com.xrotor.design.pattern.struct.facade;

/**
 * @author eks5115
 */
public class SystemB implements System {

    @Override
    public void operate() {
        java.lang.System.out.println("SystemB: operate");
    }
}
