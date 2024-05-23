package org.chief.day05.dimarray.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise_DimArray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력 : ");
		int arrSize = sc.nextInt();
		
		int [][] array = new int[arrSize][arrSize];
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				//array[i][j] = (char)(rand.nextInt(26)+97);
				//찾아야 하는 규칙 -> 	숫자가 순차적으로 커지는 라인 인지			:사각형 기준 위 -> i가 length/2 보다 작음
				//						숫자가 순차적으로 작아지는 라인 인지		:사각형 기준 아래 -> i가 length/2 보다 큼
				//						순차적으로 숫자가 커지는 열의 조건			:사각형 기준 왼쪽 -> j가 length/2 보다 작음
				//						순차적이지 숫자가 작아지는 열의 조건		:사각형 기준 오륵쪽 -> j가 length/2 보다 큼
				//						
				
				if(i<array.length/2) {	//짝수행
					if(i<=j)		//순차적으로 숫자가 증감하는 영역
						array[i][j] = array.length*(i+1) - j;
					else {
						if(j%2==0) {
							array[i][j] = array.length*4*(j-1) + j;
						}
						else {
							array[i][j] = array.length*4*(j-1) - j;
						}
					}
				}
				
				else {			//홀수행
					if(i<=j)		//순차적으로 숫자가 증감하는 영역
						array[i][j] = array.length + j;
					else {
						if(j%2==0) {
							array[i][j] = array.length*4*(j-1) + j;
						}
						else {
							array[i][j] = array.length*4*(j-1) - j;
						}
					}
				}
				
				
//				if(i==0) 									//첫번째 행일때 오른쪽에서 왼쪽으로 커짐
//					array[i][j] = array.length - j; 
//				else if(i==array.length-1) 					//마지막 행일때 왼쪽에서 오른쪽으로 커짐
//					array[i][j] = array.length*2 - 1 + j;
//				else {										//첫번째 또는 마지막 열이 아닌 경우 
//					if(j==0) {								//첫번째 행
//						array[i][j] = array.length + i;
//					}else if(j==array.length-1) {			//마지막 행
//						array[i][j] = array.length*4 - 3 - i;
//					}else {									//사이의 행
//						array[i][j] = array.length + i;
//					}
//				}
			}
		}
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				System.out.printf("%-2d ",array[i][j]);
			}System.out.println();
		}
		

	}

}
