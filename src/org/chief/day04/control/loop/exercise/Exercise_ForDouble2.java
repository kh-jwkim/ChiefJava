package org.chief.day04.control.loop.exercise;

public class Exercise_ForDouble2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		0시 0분부터 23시 59분까지 출력하기
		
		for(int h=0; h<24; h++)
			for(int m=0; m<60; m++)
				System.out.printf("%2d시 %-2d분\n",h,m);

	}

}
