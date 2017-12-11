package com.xrotor.struct.adapter;

/**
 * Created by Chen_Sen on 2016/7/21.
 */
public class Adapter implements Target {

    private Adaptee adaptee;

    //通过构造函数传入具体的被适配类的对象
    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        //使用代理的方式完成特殊请求
        adaptee.specificRequest();
    }
}
