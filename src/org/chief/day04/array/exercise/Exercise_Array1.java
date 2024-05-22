package org.chief.day04.array.exercise;

import java.util.Scanner;

public class Exercise_Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		배열의 length 필드를 이용하여 배열 크기만큼 정수를
//		입력받고 평균을 구하는 프로그램을 작성하여라
//		단, 배열의 크기는 5이다
//		ex) 정수 입력 : 24
//		(...snip...)
//		정수입력 : 7
//		평균 : 12
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int sum=0;
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("정수 입력 : ");
			arr[i] = sc.nextInt();
		}
		for(int num: arr)
			sum += num;
			
		System.out.println("평균 : "+((double)sum/arr.length));	//형변환이 sum/arr.length연산되기 전에 수행되어야 정상적인 값이 나옴!

	}

}
