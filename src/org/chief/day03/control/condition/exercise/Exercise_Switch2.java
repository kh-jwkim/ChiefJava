package org.chief.day03.control.condition.exercise;

import java.util.Scanner;

public class Exercise_Switch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		문제3
//		점수를 입력받아 등급을 알려주는 프로그램을 작성
//		점수를 입력해주세요 : 92
//		학점은 A입니다
//		단, 점수는 0~100 사이의 수를 입력하도록 함
//		점수를 입력해주세요 : 102
//		0 ~ 100 사이의 수를 입력해주세요
//		커트라인 ( 90 ~ 100 : A, 89 ~ 80 : B, 79 ~ 70 : C, 69 ~ 60 : D, 그 외 F)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력해주세요 : ");
		int score = sc.nextInt();
		char grade;

		if(0<=score && score<=100) {
			
			switch(score/10) {
			case 10:
				grade = 'A';
				break;
			case 9:
				grade = 'A';
				break;
			case 8:
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			case 6:
				grade = 'D';
				break;
			default:
				grade = 'F';
			}
			
//			switch(true) {
//			case (score>90):
//				grade = 'A';
//				break;
//			case (score>80):
//				grade = 'B';
//				break;
//			case (score>70):
//				grade = 'C';
//				break;
//			case (score>60):
//				grade = 'D';
//				break;
//			default:
//				grade = 'F';
//			}
			
			System.out.println("학점은 "+grade+"입니다");
		}
		else {
			System.out.println("0 ~ 100 사이의 수를 입력해주세요");
		}
	}

}
