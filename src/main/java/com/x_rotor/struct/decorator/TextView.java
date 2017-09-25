package com.x_rotor.struct.decorator;

/**
 * Created by Chen_Sen on 2016/8/9.
 */
public class TextView implements Component {
    @Override
    public void draw() {
        System.out.println("draw TextView");
    }
}
