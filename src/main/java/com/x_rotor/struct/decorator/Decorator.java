package com.x_rotor.struct.decorator;

/**
 * Created by Chen_Sen on 2016/8/9.
 */
public abstract class Decorator implements Component{
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void draw() {
        component.draw();
    }
}
