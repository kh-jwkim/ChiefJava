package org.chief.day04.array.practice;

import java.util.Scanner;

public class Practice_Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	메소드 명 : public void practice3(){}
		//	사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
		//	1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
		//
		//	ex.
		//	양의 정수 : 5
		//	1 2 3 4 5
		
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 입력 : ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}

	}

}
