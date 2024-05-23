package org.chief.day04.array.practice;

import java.util.Scanner;

public class Practice_Array7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	메소드 명 : public void practice7(){}
		//	사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
		//	배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
		//	그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
		//
		//	ex.
		//	정수 : 5
		//	배열 0번째 인덱스에 넣을 값 : 4
		//	배열 1번째 인덱스에 넣을 값 : -4
		//	배열 2번째 인덱스에 넣을 값 : 3
		//	배열 3번째 인덱스에 넣을 값 : -3
		//	배열 4번째 인덱스에 넣을 값 : 2
		//	4 -4 3 -3 2
		//	총 합 : 2
		
		Scanner sc = new Scanner(System.in);
		int sum=0;
		
		System.out.print("정수 : ");
		int[] arr = new int[sc.nextInt()];		//배열 길이를 입력받는다
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("배열 "+i+"번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();				//배열의 i번째에 입력받은 값을 저장
			sum += arr[i];						//sum에 해당 숫자를 합산
		}
		
		for(int i: arr)
			System.out.print(i+" ");			//배열의 각 값을 출력
		System.out.println("\n총 합 : "+sum);	//배열의 각 값의 합을 출력

	}

}
