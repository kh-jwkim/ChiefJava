package org.chief.day08.oop.objectarray;

public class Circle {
	public int radius;
	
	public Circle() {}
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return 3.14 * this.radius * this.radius;
	}
}
