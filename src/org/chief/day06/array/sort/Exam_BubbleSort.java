package org.chief.day06.array.sort;

public class Exam_BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	버블정렬이란?
		//	인접한 두개의 원소를 검사하여 정렬하는 방법
		//	구현이 쉽다는 장점, 이미 정렬된 데이터를 정렬할 때 가장 빠름
		//	기본적으로 다른 정렬에 비해서 속도가 느린편이며 역순으로 정렬할 때 가장 느림.
		//	{2, 5, 4, 1, 3}	시작지점
		//	{2, 5, 4, 1, 3}	1회
		//	{2, 4, 5, 1, 3}	2회
		//	{2, 4, 1, 5, 3}	3회
		//	{2, 4, 1, 3, 5}	4회
		//	첫번째 결과 {2, 4, 1, 3, 5}
		//	{2, 4, 1, 3, 5}	
		//	{2, 4, 1, 3, 5}	1회
		//	{2, 1, 4, 3, 5}	2회
		//	{2, 1, 3, 4, 5}	3회
		//	두번째 결과 {2, 1, 3, 4, 5}
		//	{2, 1, 3, 4, 5}
		//	{1, 2, 3, 4, 5}	1회 - 정렬 끝
		//	{1, 2, 3, 4, 5}	2회
		//	세번째 결과 {1, 2, 3, 4, 5}
		//	{1, 2, 3, 4, 5}
		//	{1, 2, 3, 4, 5}	1회 - 끝
		
		int[] arr = {2, 5, 4, 1, 3};
		
		for(int num: arr)
			System.out.print(num+" ");
		System.out.println();
		
		for(int i=0; i<arr.length-1; i++) {			// i = 루프가 돌 때 마다 1씩 증가, 비교할 범위를 줄이는데 사용된다
			for(int j=0; j<arr.length-1-i; j++) {	// j = 비교할 기준이 되는 인덱스, i값 -1 까지(비교범위 가장 오른쪽) 진행된다 
				if(arr[j]>arr[j+1]) {				// j에 있는 값이 오른쪽의 값보다 크면 서로 바꿔준다
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		for(int num: arr)
			System.out.print(num+" ");
		System.out.println();

	}

}
