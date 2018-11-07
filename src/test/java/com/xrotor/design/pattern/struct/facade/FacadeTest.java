package com.xrotor.design.pattern.struct.facade;

import org.junit.Test;

/**
 * @author eks5115
 */
public class FacadeTest {

    @Test
    public void test() {
        Facade facade = new Facade();
        facade.wrapOperate();
    }
}
