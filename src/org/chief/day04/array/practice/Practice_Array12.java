package org.chief.day04.array.practice;

import java.util.Scanner;

public class Practice_Array12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	메소드 명 : public void practice12(){}
		//	문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고
		//	문자의 개수와 함께 출력하세요.
		//
		//	ex.
		//	문자열 : application
		//	문자열에 있는 문자 : a, p, l, i, c, t, o, n
		//	문자 개수 : 8
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String inputText = sc.next();
		char[] textArray = new char[inputText.length()];
		
		System.out.print("문자열 : ");
		for(int i=0; i < inputText.length(); i++) {
			textArray[i] = inputText.charAt(i);
			
			System.out.print(textArray[i]);
			if(i!=inputText.length()-1)
				System.out.print(", ");
		}
		System.out.println("\n문자 개수 : "+textArray.length);

	}

}
