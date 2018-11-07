package com.xrotor.design.pattern.struct.proxy;

/**
 *
 * @author eks5115
 */
public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null){
            realImage = new RealImage(fileName);
        }
        System.out.println("Proxy Befor");
        realImage.display();
        System.out.println("Proxy After");
    }
}
