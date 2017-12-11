package com.xrotor.struct.decorator;

/**
 * Created by Chen_Sen on 2016/8/9.
 */
public class BorderDecorator extends Decorator {

    private int width;

    public BorderDecorator(Component component, int width) {
        super(component);
        this.width = width;
    }

    @Override
    public void draw() {
        super.draw();
        drawBorder();
    }

    private void drawBorder() {
        System.out.println("draw border:"+width);
    }
}
