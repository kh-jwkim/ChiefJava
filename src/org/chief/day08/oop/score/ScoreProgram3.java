package org.chief.day08.oop.score;

public class ScoreProgram3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		
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
				student.displayMsg("프로그램이 종료되었습니다.");
				return;

			default:
				student.displayMsg("1~3 사이의 숫자를 입력해주세요.");
				break;
			}
		}
	}

}
