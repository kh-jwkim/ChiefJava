package org.chief.day10.oop.abstractex;

abstract class Line extends Shape {	//추상클래스를 상속받고 class 앞에 abstract 키워드를 넣으면 일단은 빨간줄이 안뜬다... 
									//왜냐면 얘도 추상클래스라서 인스턴스를 그냥 생성할 수 없기 때문!
									//상속 받으면서 추상메서드를 오버라이딩하고 추상클래스가 아닌 경우여야 인스턴스 생성 가능하다.
	@Override
	public void draw() {			//하지만 추상메서드가 있다면 무조건 오버라이딩 해줘야 함
		// TODO Auto-generated method stub
		
	}
}

// 추상클래스
public abstract class Shape {
// 그냥 클래스
//public class Shape {
	String name;
	
	public Shape() {}
	
	public void paint() {}			//일반메서드
	public abstract void draw();	//추상메서드(몸체({}) 없음), 있으면 반드시 추상클래스
									//The abstract method draw in type Shape can only be defined by an abstract class
}
