package com.xrotor.design.pattern.create.singleton;

public class Singleton {

	private static Singleton inst = new Singleton();
	
	private Singleton(){}

	public static  Singleton getInstance() {
		return inst;
	}

	public void operation() {
		System.out.println("Singleton operation");
	}
	

}