package org.chief.day02.operator;

import java.util.Scanner;

public class Exam_Arithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		산술연산
//		+, -, *, /, %
//		% : 나머지를 구해주는 연산자
//		문제1
//		초 단위의 정수를 입력받고 몇시간, 몇분, 몇초 인지 출력하는 프로그램을 작성하라.
		
		Scanner sc = new Scanner(System.in);
		int input, h, m, s;
		
		System.out.print("몇초? : ");
		input = sc.nextInt();
		
		h=input/(60*60);		//input/(초->분단위)*(분->시단위)
//		m=(input-(60*60*h))/60;
		m=(input/60)%60;
		s=input%60;
		
		System.out.println("입력받은 시간은 "+h+"시간 "+m+"분 "+s+"초 입니다.");
	}

}
