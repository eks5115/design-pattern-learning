package com.xrotor.struct.decorator;

/**
 * Created by Chen_Sen on 2016/8/9.
 */
public class ScrollDecorator extends Decorator {

    public ScrollDecorator(Component component) {
        super(component);
    }

    @Override
    public void draw() {
        super.draw();
        drawScroll();
    }

    private void drawScroll() {
        System.out.println("draw scroll");
    }
}
