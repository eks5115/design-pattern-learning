package com.xrotor.struct.bridge;

/**
 * @author eks5115
 */
public class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void operation() {
        implementor.operationImpl();
        System.out.println("RefinedAbstraction: operation");
    }
}
