package org.chief.day04.array.practice;

import java.util.Scanner;

public class Practice_Array8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	메소드 명 : public void practice8(){}
		//	3이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
		//	중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
		//	단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
		//	다시 정수를 받도록 하세요.
		//
		//	ex.
		//	정수 : 4
		//	다시 입력하세요.
		//	정수 : -6
		//	다시 입력하세요.
		//	정수 : 5
		//	1, 2, 3, 2, 1
		
		Scanner sc = new Scanner(System.in);
		int inputNum, count=0;
		
		System.out.print("정수 : ");
		while((inputNum=sc.nextInt())<3 || inputNum%2==0)		//숫자 입력받고 3미만 또는 짝수인 경우 재입력
			System.out.print("다시 입력하세요.\n\n정수 : ");
		
		int[] arr = new int[inputNum];
		
		for(int i=0; i<inputNum; i++) {
			if(i*2 < inputNum) {								//인덱스 i값이 배열 길이의 절반 미만일 때(시작 부터 중간값 직전)
				arr[i] = ++count;
				System.out.print(arr[i]+", ");
			}
			else {												//인덱스 i값이 배열 길이의 절반 미만일 때(중간값 부터 끝 까지)
				arr[i] = --count;
				System.out.print(arr[i]);
				if(i!=inputNum-1)								//i가 마지막 값이 아닌 경우에 , 출력
					System.out.print(", ");
			}
		}
		
	}

}
