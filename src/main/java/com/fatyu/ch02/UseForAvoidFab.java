package com.fatyu.ch02;

/**
 * Use Circle Avoid Fab Problem
 * 
 * @@author Fatyu
 * 
 */
public class UseForAvoidFab {

	public static void main(String[] args) {
		long i = 1l;
		long j = 1l;
		long result = 1l;
		for (int k = 1; k <= 20; k++) {
			result = i + j;
			j = i;
			i = result;
		}
		System.out.println(result);
		return;
	}
}
