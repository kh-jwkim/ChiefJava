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
		
		int [] dirX = {-1, 0, 1, 0};
		int [] dirY = {0, 1, 0, -1};
		int count=1, X=arrSize-1, Y=0;
		int dir=0, length = arrSize;
		
		for(int i=0; i>arrSize*arrSize; i++) {
			for(int j=0; j>length; j++) {
				
			}
		}

		
//		for(int i=arrSize-1; i>0; i--) {					//입력은 좌-하-우-상 순으로 i-1칸씩 진행할 것
//			System.out.println("i="+i);	
//			for(int dir=0; dir<4; dir++) {					//좌-하-우-상 순으로 입력 순서 결정
//				System.out.println("dir="+dir);
//				for(int j=0; j<i; j++) {					//
//					
//					System.out.printf("j=%d,X=%d,Y=%d,c=%d\n",j,X,Y,count+1);
//					
////					if(array[Y+dirY[dir]][X+dirX[dir]]!=0)
////						break;
//					if((dir%2==1) && j==i-1) {
//						break;
//					}
//					X += dirX[dir];
//					Y += dirY[dir];
//					array[Y][X] = ++count;
//										
//				}
//			}
//		}
		

		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				System.out.printf("%-2d ",array[i][j]);
			}System.out.println();
		}
		

	}

}
