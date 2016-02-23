package com.fatyu.annotation.inherited;
@InheritedTest
public class Father {
	
	public static void main(String[] args) {
		System.out.println("ranker");
	}
	@InheritedTest
	public void test(){
		System.out.println("i'm a father method!");
	}
}

