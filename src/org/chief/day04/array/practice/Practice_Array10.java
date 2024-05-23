package org.chief.day04.array.practice;

import java.util.Scanner;

public class Practice_Array10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	메소드 명 : public void practice10(){}
		//	주민등록번호 성별자리 이후부터 *로 가리고 출력하세요.
		//	단, 원본 배열 값은 변경 없이 배열 복사본으로 변경하세요.
		//
		//	ex.
		//	주민등록번호(-포함) : 123456-1234567
		//	123456-1******
		
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : ");
		String inputNumber = sc.next();
		
		char[] number = new char[inputNumber.length()];
		for(int i=0; i < number.length; i++)			//number 배열에는 원본 데이터 저장
			number[i] = inputNumber.charAt(i);
			
		char[] blockedNumber = new char[number.length];
		for(int i=0; i < number.length; i++) {			//blockedNumber 배열에는 성별자리 이후부터 *로 저장
			if(i<8)
				blockedNumber[i] = number[i];			//성별 자리 까지는 number의 값을 blockedNumber에 저장!
			else
				blockedNumber[i] = '*';					//성별 자리 이후는 *을 blockedNumber에 저장!
		}
		
		for(int i=0; i < blockedNumber.length; i++)
			System.out.print(blockedNumber[i]);
		

	}

}
