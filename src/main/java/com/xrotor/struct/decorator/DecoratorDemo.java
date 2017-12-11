package com.xrotor.struct.decorator;

/**
 * Created by Chen_Sen on 2016/8/9.
 */
public class DecoratorDemo {
    public static void main(String[] args) {
        TextView textView = new TextView();

        Component component = new BorderDecorator(new ScrollDecorator(textView), 1);
        component.draw();
    }
}
