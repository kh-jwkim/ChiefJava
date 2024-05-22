package org.chief.day02.exercise;

import java.util.Scanner;

public class Exercise_Logical2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		입력받은 문자가 대문자인지 소문자인지 확인하세요
//		변수 word에 초기화
//		영어 대문자 확인 : true
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 입력 : ");
		char word = sc.next().charAt(0);
		boolean res = 64<(int)word && (int)word < 91;
		System.out.println("영어 대문자 확인 : "+res);
	}

}
