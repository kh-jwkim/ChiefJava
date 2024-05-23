package org.chief.day04.array.practice;

public class Practice_Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	메소드 명 : public void practice1(){}
		//	길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
		//	순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요.
		//
		//	ex.
		//	1 2 3 4 5 6 7 8 9 10
		
		int[] arr = new int[10];
		
		for(int i=1; i<=10; i++) {
			arr[i-1]=i;
			System.out.print(arr[i-1]+" ");
		}

	}

}
