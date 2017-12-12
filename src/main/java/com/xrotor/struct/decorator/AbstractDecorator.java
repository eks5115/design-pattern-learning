package com.xrotor.struct.decorator;

/**
 *
 * @author eks5115
 */
public abstract class AbstractDecorator implements Component{
    private Component component;

    AbstractDecorator(Component component) {
        this.component = component;
    }

    @Override
    public void draw() {
        component.draw();
    }
}
