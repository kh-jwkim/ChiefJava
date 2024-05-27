package org.chief.day05.dimarray.exercise;

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
		int count=0, X=arrSize-1, Y=0;
		int dir=0, distance = arrSize;
		
		for(int i=0; i<arrSize*arrSize; i++) {		//행렬의 전체 크기 갯수만큼 숫자 입력할것
			//if(distance<0) break;	//행렬이 전부 작성 완료되었을 때
//			System.out.printf("t_j=%d,dir=%d,X=%d,Y=%d,c=%d\n",distance,dir,X,Y,count);
			for (int j=0;j<distance-1;j++) {
//				System.out.printf("j=%d,dir=%d,X=%d,Y=%d,c=%d\n",distance,dir,X,Y,count);
				array[Y][X] = ++count;
				X += dirX[dir];
				Y += dirY[dir];
			} 	//같은 방향으로 일정 칸을 움직이기 위한 for문
			
			if(array[Y][X]!=0) break;	//행렬의 빈 칸이 더이상 없을 경우 == 작성이 완료
			array[Y][X] = ++count;
			
			dir++;					//방향전환
			if(dir%2==1) {
				distance--;
			}else if(dir==4) 
				dir=0;
			X += dirX[dir];
			Y += dirY[dir];
				
		}


		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				System.out.printf("%-2d ",array[i][j]);
			}System.out.println();
		}
		
		sc.close();
	}

}
