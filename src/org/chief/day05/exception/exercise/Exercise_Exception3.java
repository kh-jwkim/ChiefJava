package org.chief.day05.exception.exercise;

import java.util.Scanner;

public class Exercise_Exception3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	문제3
		//	배열의 인덱스가 범위를 벗어날 때
		//	발생하는 ArrayIndexOutOfBoundsException을
		//	처리하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		int[] arr = {1,3,5,7,9};
		System.out.print("조회할 배열의 인덱스 값 입력 : ");
		int index = sc.nextInt();
		
		try {
			System.out.println("조회된 값 : "+arr[index]);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("배열의 범위를 벗어나는 인덱스입니다.");
		}
		
		
	}

}
