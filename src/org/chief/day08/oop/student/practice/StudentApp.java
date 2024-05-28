package org.chief.day08.oop.student.practice;

import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student[] clas = new Student[3];
		Scanner sc = new Scanner(System.in);
		ManageStudent manage = new ManageStudent();
		ViewStudent view = new ViewStudent();
		end :
		while (true) {
			switch (view.printMenu()) {
			case 1:
				view.inputScore(manage.printInfo());
				break;
			case 2:
				view.printScore(manage.printInfo());
				break;
			case 3:
				
				break end;

			default:
				break;
			}
		}
		sc.close();
	}

}
