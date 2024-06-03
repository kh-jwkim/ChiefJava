package org.chief.day12.collection.student;

import java.util.List;

public class StudentRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManageStudent mng = new ManageStudent();
		ViewStudent view = new ViewStudent();
		end :
		while (true) {
			switch (view.printMenu()) {
			case 1:
				Student std = view.inputStudent();
				mng.registerStudent(std);
				break;
			case 2:
				String searchName = view.selectStudent();
				mng.searchOneByName(searchName);	//여기서 List<Student>로 값 받는게 맞나...?
				break;
			case 3:
				List<Student> stdList = mng.selectAllStudents();
				view.displayStudents(stdList);
				break;
			case 4:
				String modName = view.selectStudent();
				int modIndex = mng.searchIndexByName(modName);
				Student modStudent = view.inputStudent();
				mng.modifyStudent(modIndex, modStudent);
				break;
			case 5:
				String delName = view.selectStudent();
				int delIndex = mng.searchIndexByName(delName);
				mng.deleteStudent(delIndex);
				break;
			case 6:
				break;
			case 0:
				view.displayMsg("프로그램을 종료합니다.");
				break end;

			default:
				view.displayMsg("메뉴를 다시 선택해주세요.");
				break;
			}
		}
	}

}
