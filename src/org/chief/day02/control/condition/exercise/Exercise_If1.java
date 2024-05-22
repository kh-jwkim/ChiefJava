package org.chief.day02.control.condition.exercise;

import java.util.Scanner;

public class Exercise_If1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		문제1
//		점수와 학년을 정수로 입력받아 60점 이상이면 합격
//		60점 미만이면 불합격으로 출력한다.
//		단, 4학년의 경우 70점 이상이어야 합격을 출력하는 프로그램을 작성하시오
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 : ");
		int score = sc.nextInt();
		
		System.out.print("학년 : ");
		int grade = sc.nextInt();
		
		String res;
		
//		if(grade!=4) 
//		{
//			if(score>=60) {
//				res="합격";
//			}
//			else {
//				res="불합격";
//			}
//		}
//		else
//		{
//			if(score>=70) {
//				res="합격";
//			}
//			else {
//				res="불합격";
//			}
//		}
		
		if(grade!=4 && score>=60) {
			res="합격";
		}else if(grade==4 && score>=70) {
			res="합격";
		}else {
			res="불합격";
		}
		
		System.out.println("시험 결과는 "+res);
	}

}
