package org.chief.day03.control.loop;

import java.util.Scanner;

public class Exam_DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Do ~ While
//		문법
//		초기식;
//		do {
//			실행문장; 증감식; 
//		} while(조건식)
		int num=0, sum=0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("정수 하나 입력 : ");
			num = sc.nextInt();
			if(num == -1) break;
			sum += num;
		} while(num != -1);
		System.out.println("총합 : " + sum);

	}

}
