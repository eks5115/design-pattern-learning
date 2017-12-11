package com.xrotor.struct.adapter;

/**
 * Created by Chen_Sen on 2016/7/21.
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("普通具体类 普通请求");
    }
}
