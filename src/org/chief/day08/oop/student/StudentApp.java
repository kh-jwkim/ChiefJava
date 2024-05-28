package org.chief.day08.oop.student;

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManageStudent student = new ManageStudent();
		ViewStudent view = new ViewStudent();
		
		while(true) {
			switch (student.printMenu()) {
			case 1:
//				inputScore(grade);
				student.inputScore();
				break;
			case 2:
//				printScore(grade);
				student.printScore();
				break;
			case 3:
				view.displayMsg("프로그램이 종료되었습니다.");
				return;

			default:
				view.displayMsg("1~3 사이의 숫자를 입력해주세요.");
				break;
			}
		}

	}

}
