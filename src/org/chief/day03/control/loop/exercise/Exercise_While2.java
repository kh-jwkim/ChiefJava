package org.chief.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_While2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		While문을 이용하여 -1이 입력될때까지 정수를 입력받고
//		-1이 입력되면 입력한 수의 합을 출력하시오
		
		Scanner sc = new Scanner(System.in);
		
		int getNum=0, sum=0;
		while((getNum = sc.nextInt()) != -1) {
			sum+=getNum;
		}System.out.println("입력한 수의 합 : "+sum);
		
	}

}
