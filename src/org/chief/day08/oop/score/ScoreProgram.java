package org.chief.day08.oop.score;

import java.util.Scanner;

public class ScoreProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] grade = new int[3];
		
		escape :
		while(true) {
			
			System.out.println("====== 메인 메뉴 ======\r\n"
					+ "1. 성적입력\r\n"
					+ "2. 성적출력\r\n"
					+ "3. 종료\r\n"
					+ "선택 : ");
			
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("====== 성적 입력 ======");
				System.out.print("국어 : ");
				grade[0] = sc.nextInt();
				System.out.print("영어 : ");
				grade[1] = sc.nextInt();
				System.out.print("수학 : ");
				grade[2] = sc.nextInt();
				break;
			case 2:
				System.out.println("====== 성적 출력 ======");
				System.out.println("국어 : "+grade[0]);
				System.out.println("영어 : "+grade[1]);
				System.out.println("수학 : "+grade[2]);
				int sum=0;
				for(int i: grade)
					sum+=i;
				System.out.println("총점 : "+sum);
				System.out.println("평균 : "+(float)(sum/grade.length));
				
				break;
			case 3:
				System.out.println("프로그램이 종료되었습니다.");
				sc.close();
				break escape;
//				return;

			default:
				System.out.println("1~3 사이의 숫자를 입력해주세요.");
				break;
			}
		}
	}
}
