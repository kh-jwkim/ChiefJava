package org.chief.day01.basic;

public class Exam_Constant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수는 소문자로 시작!
		//상수는 모두 대문자
		final double PI = 3.141592;
		
		// PI=3.24; //상수는 재할당 불가능!!
		double radius = 10.2;
		//위에서 선언한 radius 변수의 값을 바꿔준다
		radius = 5.4;
		double circleArea = radius * radius * PI;
		//System.out.println("원의 면적 : " + circleArea);
		
		int intData = (int)radius;
		System.out.println(intData);
	}

}
