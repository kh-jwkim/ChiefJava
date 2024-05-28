package org.chief.day08.oop.student.practice;

import java.util.Scanner;

public class ViewStudent {
	Scanner sc = new Scanner(System.in);
	
	public Student inputStudent() {
		// TODO Auto-generated method stub
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("국어 : ");
		int first = sc.nextInt();
		System.out.print("수학 : ");
		int second = sc.nextInt();
		
		return new Student(name,first,second);
	}
	
	public int printMenu() {
		// TODO Auto-generated method stub
		System.out.print("====== 메인 메뉴 ======\r\n"
				+ "1. 성적입력\r\n"
				+ "2. 성적출력\r\n"
				+ "3. 종료\r\n"
				+ "선택 >> ");
		int choice = sc.nextInt();
		
		return choice;
	}
	
	public Student[] inputScore(Student[] students) {
		
		for(int i=0; i<students.length; i++) 
			students[i] = this.inputStudent();
		
		return students;
	}
	
	public void printScore(Student[] students) {
		for(int i=0; i<students.length; i++) {
			System.out.println("======"+(i+1)+"번째 학생의 정보 출력 ======");
			System.out.println(students[i].name+" 학생의 첫번째 점수는 "+students[i].firstScore+"점, 두번째 점수는 "+students[i].secondScore+"입니다.");
		}
	}
}
