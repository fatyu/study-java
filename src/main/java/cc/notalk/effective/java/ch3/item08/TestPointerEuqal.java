package cc.notalk.effective.java.ch3.item08;

import java.awt.Color;

/**
 * 重写高质量的equals方法
 * @author fatyu
 *
 */
public class TestPointerEuqal {
	public static void main(String[] args) {
		Point p1 = new Point(1, 2);
		ColorPoint p2 = new ColorPoint(1, 2, Color.BLACK);
		ColorPoint p3 = new ColorPoint(1, 2, Color.RED);
		System.out.println(p2.equals(p1));
		System.out.println(p2.equals(p3));
		System.out.println(p3.equals(p2));
	}
}

/**
 * Point 类 重写了父类的equals方法
 * 
 * @author fatyu
 * 
 */
class Point {
	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	// 重写父类的equals方法
	public boolean equals(Object obj) {
		if (obj instanceof Point) {
			Point p = (Point) obj;
			return p.x == x && p.y == y;
		}
		return false;
	}
}

/**
 * ColorPoint继承了Point类并添加了新的属性
 * 
 * 
 * @author fatyu
 * 
 */
class ColorPoint extends Point {
	private Color color;

	public ColorPoint(int x, int y, Color color) {
		super(x, y);
		this.color = color;
	}

	/*
	 * 不满足第二规范要求
	 * 
	 * @@Override//重写父类的equals方法 public boolean equals(Object obj) {//
	 * 和父类的对象进行比较时既不满足第二个规范要求也不满足第三个规范要求 if (obj instanceof ColorPoint) {
	 * ColorPoint p = (ColorPoint) obj; return super.equals(obj) && p.color ==
	 * color; } return false; }
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Point) {
			Point p2 = (Point) obj;
			return super.equals(p2);
		} else if (obj instanceof ColorPoint) {
			ColorPoint p = (ColorPoint) obj;
			return super.equals(p) && p.color == color;
		} else {
			return false;
		}
	}

}
