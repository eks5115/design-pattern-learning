package com.xrotor.design.pattern.struct.decorator;

/**
 *
 * @author eks5115
 */
public class TextView implements Component {
    @Override
    public void draw() {
        System.out.println("draw TextView");
    }
}
