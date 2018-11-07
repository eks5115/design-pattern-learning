package com.xrotor.design.pattern.struct.decorator;

/**
 *
 * @author eks5115
 */
public class ScrollDecorator extends AbstractDecorator {

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
