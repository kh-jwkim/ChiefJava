package org.chief.day09.oop.overriding;

public class Circle extends Shape {
	@Override	//어노테이션은 생략 가능
	public void draw() {
		System.out.println("Circle");
	}
}
