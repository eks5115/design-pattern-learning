package com.x_rotor.create.singleton;

/**
 * Created by Chen_Sen on 2016/7/23.
 */
public class SingletonDemo {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.operation();
    }
}