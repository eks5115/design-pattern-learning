package com.x_rotor.struct.adapter;

/**
 * Created by Chen_Sen on 2016/7/21.
 */
public class AdapterDemo {

    public static void main(String args[]) {
        //使用普通类
        Target concreteTarget = new ConcreteTarget();
        concreteTarget.request();

        //使用适配类
        Target adapter = new Adapter(new Adaptee());
        adapter.request();

    }
}
