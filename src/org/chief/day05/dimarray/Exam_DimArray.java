package org.chief.day05.dimarray;

public class Exam_DimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;						//변수
		int [] nums = new int[10];			//배열
		int [][] dimNums = new int[2][5];	//2차원 배열
		System.out.println("행의 길이 : " + dimNums.length);
		System.out.println("열의 길이 : " + dimNums[0].length);
		
		int [][] arrs = new int[4][4];
		int k = 1;
		for(int i=0; i < arrs.length; i++) {
			for(int j=0; j < arrs[i].length; j++) {
				arrs[i][j] = k++;
			}
		}
		
		for(int[] arr : arrs) {					//for-each로 다차원배열 출력
			for(int i : arr) {
				System.out.printf("%2d ",i);
			}System.out.println();
		}
		
		for(int i=0; i < arrs.length; i++) {	//일반적인 for문으로 다차원배열 출력
			for(int j=0; j < arrs[i].length; j++) {
				System.out.printf("%2d ",arrs[i][j]);
			}System.out.println();
		}

	}

}
