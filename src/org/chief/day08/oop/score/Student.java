package org.chief.day08.oop.score;

import java.util.Scanner;

public class Student {
	//멤버 필드
	int kor;
	int eng;
	int math;
	static Scanner sc = new Scanner(System.in);
	
	//생성자
	public Student() {
		
	}
	
	//멤버 메소드
	//메뉴 출력
	public int printMenu() {
		System.out.println("====== 메인 메뉴 ======\r\n"
				+ "1. 성적입력\r\n"
				+ "2. 성적출력\r\n"
				+ "3. 종료\r\n"
				+ "선택 >> ");
		int choice = sc.nextInt();
		
		return choice;
	}
	
	//성적 입력
	public void inputScore() {
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
	
	//메시지 출력
	public void displayMsg(String msg) {
		System.out.println(msg);
	}
}
