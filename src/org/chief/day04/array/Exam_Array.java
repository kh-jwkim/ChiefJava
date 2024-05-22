package org.chief.day04.array;

public class Exam_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;	//변수의 선언
		num = 1;	//변수의 초기화
		
		int[] nums;			//배열의 선언 // 대괄호의 위치는 타입식별자와 배열의 이름 사이 또는 배열의 이름 뒤에 쓸 수 있다.
		nums = new int[10];	//배열의 생성(할당) // 생성 시 
		nums[0] = 1;		//배열의 초기화
		
		System.out.println(nums);
		
		for(int i=0; i < nums.length; i++) 
			System.out.print(nums[i] + " ");
		
		System.out.println();
		
		for(int i:nums) System.out.print(i + " ");

	}

}
