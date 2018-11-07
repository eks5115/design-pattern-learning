package com.xrotor.design.pattern.struct.facade;

/**
 * @author eks5115
 */
public class Facade {

    private System systemA;

    private System systemB;

    public Facade() {
        systemA = new SystemA();
        systemB = new SystemB();
    }

    public void wrapOperate() {
        systemA.operate();
        systemB.operate();
    }

}
