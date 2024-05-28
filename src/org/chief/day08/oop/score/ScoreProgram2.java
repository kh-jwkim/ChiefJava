package org.chief.day08.oop.score;

import java.util.Scanner;

public class ScoreProgram2 {
	
	static int kor, eng, math;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(true) {
			switch (printMenu()) {
			case 1:
				inputScore();
				break;
			case 2:
				printScore();
				break;
			case 3:
				displayMsg("프로그램이 종료되었습니다.");
				sc.close();
				return;

			default:
				displayMsg("1~3 사이의 숫자를 입력해주세요.");
				break;
			}
		}

	}
	
	public static int printMenu() {
		
		System.out.println("====== 메인 메뉴 ======\r\n"
				+ "1. 성적입력\r\n"
				+ "2. 성적출력\r\n"
				+ "3. 종료\r\n"
				+ "선택 >> ");
		int choice = sc.nextInt();
		
		return choice;
	}
	
	public static void inputScore() {
		System.out.println("====== 성적 입력 ======");
		System.out.print("국어 : ");
		kor = sc.nextInt();
		System.out.print("영어 : ");
		eng = sc.nextInt();
		System.out.print("수학 : ");
		math = sc.nextInt();
	}
	
	public static void printScore() {
		System.out.println("====== 성적 출력 ======");
		System.out.println("국어 : "+kor);
		System.out.println("영어 : "+eng);
		System.out.println("수학 : "+math);
		System.out.println("총점 : "+(kor+eng+math));
		System.out.println("평균 : "+(float)((kor+eng+math)/3));
	}
	
	public static void displayMsg(String msg) {
		System.out.println(msg);
	}

}
