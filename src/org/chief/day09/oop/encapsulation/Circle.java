package org.chief.day09.oop.encapsulation;

public class Circle {
	public double radius;	//반지름
	public String name;	//이름
	
	public Circle() {}			//생성자
	
	//setter() 메소드
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//getter() 메소드
	public double getRadius() {
		return radius;
	}
	public String getName() {
		return name;
	}

	public double getSize() {	//넓이구하기
		//return을 쓰면 리턴값에 해당하는 데이터 타입을 써야함. 여기선 실수 연산을 하기 때문에 double
		return 3.14*radius*radius;
	}
}
