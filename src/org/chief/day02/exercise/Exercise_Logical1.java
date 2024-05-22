package org.chief.day02.exercise;

import java.util.Scanner;

public class Exercise_Logical1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		입력한 정수가 1~100 사이의 숫자인지 확인
//		변수 num에 초기화
//		1부터 100사이의 숫자인가? : true
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		boolean res = 1 <= num && num <= 100;
		System.out.println("1부터 100사이의 숫자인가? : "+res);
	}

}
