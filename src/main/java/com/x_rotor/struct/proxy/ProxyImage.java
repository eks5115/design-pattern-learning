package com.x_rotor.struct.proxy;

/**
 * Created by Chen_Sen on 2016/7/20.
 */
public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    public void display() {
        if (realImage == null){
            realImage = new RealImage(fileName);
        }
        System.out.println("Proxy Befor");
        realImage.display();
        System.out.println("Proxy After");
    }
}
