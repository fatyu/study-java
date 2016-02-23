package com.fatyu.ch03;

public class Child extends Father{


	public Child(String s) {
		super(s);
		System.out.println("Child(String s)");
	}
	
	public Child(){
		super();
		System.out.println("Child()");
	}
	public static void main(String [] args ){
		Child c = new Child();
		System.out.println(c.getClass().getName());
		
		Child c1 = new Child("Fatyu");
		System.out.println(c1.getClass().getName());
	}
}
