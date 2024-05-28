package org.chief.day08.oop.student;

import java.util.Scanner;

public class ManageStudent {
	Scanner sc = new Scanner(System.in);
	int kor;
	int eng;
	int math;
	
	public ManageStudent() {
		
	}

	public int printMenu() {
		// TODO Auto-generated method stub
		System.out.println("====== 메인 메뉴 ======\r\n"
				+ "1. 성적입력\r\n"
				+ "2. 성적출력\r\n"
				+ "3. 종료\r\n"
				+ "선택 >> ");
		int choice = sc.nextInt();
		
		return choice;
	}


	public void inputScore() {
		// TODO Auto-generated method stub
		System.out.println("====== 성적 입력 ======");
		System.out.print("국어 : ");
		kor = sc.nextInt();
		System.out.print("영어 : ");
		eng = sc.nextInt();
		System.out.print("수학 : ");
		math = sc.nextInt();
	}
	
	//성적 출력
		public void printScore() {
			System.out.println("====== 성적 출력 ======");
			System.out.println("국어 : "+kor);
			System.out.println("영어 : "+eng);
			System.out.println("수학 : "+math);
			System.out.println("총점 : "+(kor+eng+math));
			System.out.println("평균 : "+(float)((kor+eng+math)/3));
		}
	
}
