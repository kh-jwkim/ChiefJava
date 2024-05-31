package org.chief.day10.oop.interfaceex;

public class Exam_Interface {
	public static void main(String[] args) {
//		PhoneInterface phone = new PhoneInterface();
		//추상클래스와 마찬가지로 객체 생성 불가
		//자식 클래스 객체로 업캐스팅하여 사용
		PhoneInterface phone = new SamsungPhone();
		phone.printLogo();
		phone.sendCall();
		phone.showLogo();
		((SamsungPhone) phone).musicPlay();	//phone 객체는 PhoneInterface 타입으로 선언되었으므로
											//musicPlay()를 쓰기 위해서는 SamsungPhone으로 다운캐스팅 해 줘야 한다.
	}
}
