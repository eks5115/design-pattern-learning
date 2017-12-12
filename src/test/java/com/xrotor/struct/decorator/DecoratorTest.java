package com.xrotor.struct.decorator;

import com.xrotor.struct.decorator.BorderDecorator;
import com.xrotor.struct.decorator.Component;
import com.xrotor.struct.decorator.ScrollDecorator;
import com.xrotor.struct.decorator.TextView;
import org.junit.Test;

/**
 * @author eks5115
 */
public class DecoratorTest {
    @Test
    public void mainTest() {
        TextView textView = new TextView();

        Component component = new BorderDecorator(new ScrollDecorator(textView), 1);
        component.draw();
    }
}
