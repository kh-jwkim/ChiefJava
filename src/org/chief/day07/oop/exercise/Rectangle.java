package org.chief.day07.oop.exercise;

public class Rectangle {
//		너비와 높이를 입력받아
//		사각형의 넓이를 출력하는 클래스를 만드시오.
	public double width;
	public double height;
	public double area;
	
	public Rectangle() {}
	
	public double getArea() {
		return width*height;
	}

}
