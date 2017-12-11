package com.xrotor.create.singleton;

/**
 *
 * @author Chen_Sen
 * @date 2016/7/23
 */
public class SingletonDemo {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.operation();
    }
}