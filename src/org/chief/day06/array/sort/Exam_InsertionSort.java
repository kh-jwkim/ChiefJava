package org.chief.day06.array.sort;

public class Exam_InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	삽입정렬
		//	정렬 알고리즘 중에 하나, 가장 간단하고 기본이 되는 알고리즘
		//	배열의 N번 인덱스값을 0번에서 n-1번 인덱스까지 비교!
		//	N은 1부터 시작
		//	{2, 5, 4, 1, 3}
		//	첫번째 : 5와 2 비교 -> 교환 X
		//	{2, 5, 4, 1, 3}
		//	4와 비교 시작
		//	두번째 : 4와 5비교 -> 교환 X
		//			 4와 2비교 -> 교환
		//	결과 : {2, 4, 5, 1, 3}
		//	세번째 : 1과 5비교 -> 교환
		//			 1과 4비교 -> 교환
		//			 1과 2비교 -> 교환
		//	결과 : {1, 2, 4, 5, 3}
		//	네번째 : 3과 5비교 -> 교환
		//			 3과 4비교 -> 교환
		//			 3과 2비교 -> 교환 X
		
		int[] arr = {2, 5, 4, 1, 3};
		
		for(int num: arr)
			System.out.print(num+" ");
		System.out.println();
		
		for(int i=1; i<arr.length; i++) {			// i = 비교 기준이 되는값의 index,첫번째 값은 배열의 2번째(1) 자리고 배열의 오른쪽 끝 까지 간다
			System.out.println(i);
			for(int j=i; j>0; j--) {				// j = i의 자리부터 왼쪽으로 가면서 바로 왼쪽 자리와 비교할 index
				if(arr[j-1] > arr[j]) {				// 기준값이 비교값보다 큰 경우 두 숫자의 위치를 바꿔준다
					int tmp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = tmp;
				}else
					break;							// 0부터 현재 i의 범위에서 위치 변경이 더 이상 필요 없으므로 j 루프를 끝내고 i를 오른쪽으로 한 칸 밀어준다.
			}
		}
		
		
		for(int num: arr)
			System.out.print(num+" ");
		System.out.println();
		
	}

}
