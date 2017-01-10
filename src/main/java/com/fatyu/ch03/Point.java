package com.fatyu.ch03;

import java.lang.Math;
import java.lang.String;
import java.lang.System;

/**
 * 抽象为一个三维点的类
 * @@author Fatyu
 *
 */
public class Point {

	private double x;
	private double y;
	private double z;

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public double length(double x, double y, double z) {

		return Math.sqrt(x * x + y * y + z * z);
	}

	public static void main(String[] args) {
		Point p = new Point();
		p.setX(1.732);
		p.setY(1.732);
		p.setZ(1.732);

		System.out.println(p.length(p.x, p.y, p.z));

	}
}
