package org.chief.day09.oop.overriding;

public class Exam_Overriding {
	
	static void paint(Shape shape) {
		//Shape shape = new Shape();
		//Shape shape = new Circle();
		//Shape shape = new Line();
		//Shape shape = new Rectangle();
		shape.draw();
	}
	public static void main(String[] args) {
		//업캐스팅 활용 예제 -> Shape타입 뿐만 아니라 Shape를 상속받은 객체들도 매개변수로 써도 된다!!
		//슈퍼클래스의 draw() 대신 각자 Overriding된 메서드가 실행된다 => 동적 바인딩
		Shape shape = new Shape();
		paint(shape);
		paint(new Circle());
		paint(new Line());
		paint(new Rectangle());
		/*
		 * 오버라이딩
		 * 1. 오버라이딩은 상속관계에서 사용
		 * 2. 오버라이딩은 다 똑같고(접근지정자, 반환형, 메소드명, 매개변수 갯수와 타입)
		 * 실행문장만 재정의하는 것
		 * 3. 오버라이딩이 되면 동적 바인딩이 되어 다형성을 이용할 수 있음.
		 */
//		Shape shape = new Shape();
//		shape.draw();
//		Circle circle = new Circle();
//		circle.draw();
//		Line line = new Line();
//		line.draw();
//		Rectangle rect = new Rectangle();
//		rect.draw();
	}
}
