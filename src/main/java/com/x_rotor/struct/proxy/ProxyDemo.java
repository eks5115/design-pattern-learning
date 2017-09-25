package com.x_rotor.struct.proxy;

/**
 * Created by Chen_Sen on 2016/7/20.
 */
public class ProxyDemo {
    public static void main(String[] args){
        Image image = new ProxyImage("10.jpg");

        image.display();
        System.out.println("");

        image.display();
    }
}
