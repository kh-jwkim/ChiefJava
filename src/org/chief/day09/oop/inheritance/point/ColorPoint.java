package org.chief.day09.oop.inheritance.point;

public class ColorPoint extends Point{
	private String color;
	
	public ColorPoint() {
		super();	//같은 객체일때 this() 로 생성자 쓰듯이 super()는 부모의 생성자 호출
					//상속받은 경우 부모의 생성자부터 호출함.
	}
	public ColorPoint(int x, int y, String color) {
		super(x, y);	//부모클래스의 필드값은 부모의 생성자를 이용해서 데이터 입력
//		this.x = x;		//is not visible 뜨면서 안보임
//		this.y = y;
		this.color = color;	//자기자신의 필드값은 직접 입력
	}
	
	public void showColorPoint() {
		super.showPoint();	//부모클래스의 메서드 호출
		System.out.println(this.color + "색의 점입니다.");
	}
}
