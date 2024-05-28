package org.chief.day08.oop.student;

import java.util.Scanner;

public class ViewStudent {
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 메인 메뉴 ======\r\n"
				+ "1. 성적입력\r\n"
				+ "2. 성적출력\r\n"
				+ "3. 종료\r\n"
				+ "선택 >> ");
		int choice = sc.nextInt();
		sc.close();
		
		return choice;
	}
	
	//메시지 출력
	public void displayMsg(String msg) {
		System.out.println(msg);
	}
	
}
