package org.chief.day06.array.sort;

public class Exam_SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	선택정렬이란?
		//	배열을 전부 검색하여 최소값을 고르고 왼쪽부터 채워나가는 정렬
		//	특징 : 데이터의 양이 적을 때 좋은 성능을 보여주는 정렬
		//	데이터의 양이 많을 때 급격한 성능 저하를 보임.
		//	배열의 n번 인덱스값을 n+1 ~ 마지막 인덱스까지 비교함.
		//	{2, 5, 4, 1, 3}
		//	첫번째 결과 : {1, 5, 4, 2, 3}
		//	{1, 5, 4, 2, 3}
		//	두번째 결과 : {1, 2, 4, 5, 3}
		//	{1, 2, 4, 5, 3}
		//	세번째 결과 : {1, 2, 3, 5, 4}
		//	{1, 2, 3, 5, 4}
		//	세번째 결과 : {1, 2, 3, 4, 5}
		
		int[] arr = {2, 5, 4, 1, 3};
		
		for(int num: arr)
			System.out.print(num+" ");
		System.out.println();
		
		for(int i=0; i<arr.length-1; i++) {
			int min=i;
			for(int j=i+1; j<arr.length; j++) 
				if(arr[min] > arr[j]) min = j;	//최소값이 정해졌을 때 min을 arrs[min]으로 구하면 최소값
			
			int tmp = arr[i];
			arr[i] = arr[min];
			arr[min] = tmp;
		}
		for(int num: arr)
			System.out.print(num+" ");
		System.out.println();
	}

}
