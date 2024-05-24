package kr.or.iei;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] inputArr = new int[5];
		
		//input
		for(int i=0; i<inputArr.length; i++) {
			System.out.print((i+1)+"번째 정수 입력 : ");
			inputArr[i] = sc.nextInt();
		}
		
		//sort
		for(int i=0; i<inputArr.length-1; i++) {
			for(int j=0; j<inputArr.length-1-i; j++) {
				if(inputArr[j]>inputArr[j+1]) {
					int tmp = inputArr[j];
					inputArr[j] = inputArr[j+1];
					inputArr[j+1] = tmp;
				}
			}
		}
		
		
		//print
		System.out.print("정련된 결과 : ");
		for(int i: inputArr) 
			System.out.print(i+" ");
		
		System.out.println("\n정렬 후 첫번째 수와 마지막수의 합 : "+(inputArr[0]+inputArr[inputArr.length-1]));
	}

}
