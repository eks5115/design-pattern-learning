package com.xrotor.struct.decorator;

/**
 *
 * @author eks5115
 */
public class BorderDecorator extends AbstractDecorator {

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
