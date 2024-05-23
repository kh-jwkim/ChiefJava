package org.chief.day05.exception.exercise;

import java.util.Scanner;

public class Exercise_Exception4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	문제4
		//	문자열을 정수로 변환할 때
		//	발생하는 NumberFormatException을
		//	처리하는 프로그램을 작성하라.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String text = sc.next();
		
		try {
			int number = Integer.parseInt(text);
			System.out.println("변환된 숫자 : "+number);
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("숫자 이외의 문자가 입력되었습니다");
			e.printStackTrace();
		}

	}

}
