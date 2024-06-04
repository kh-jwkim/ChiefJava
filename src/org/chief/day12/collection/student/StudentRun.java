package org.chief.day12.collection.student;

import java.util.List;
import java.util.Map;

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
				String searchName = view.inputName();
				view.displayStudent(mng.searchOneByName(searchName));
				//searchOneByName에서 List<Student>를 새로 만들고 출력할 데이터를 담아서 리턴
				//displayStudent는 입력받은 ArrayList값을 출력
				
				break;
			case 3:
				List<Student> stdList = mng.selectAllStudents();
				if(stdList.size()>0)
					view.displayStudents(stdList);
				else
					view.displayMsg("회원정보가 없습니다.");
				break;
			case 4:
				String modName = view.inputName();
				int modIndex = mng.searchIndexByName(modName);
				Map<String, Object> result = mng.searchModifyStudent(modName);
//				Student modStudent = mng.searchModifyStudent(modName);
//				modStudent = view.modifyStudent(modName);
				Student modStudent = view.modifyStudent((Student)result.get("student"));
				mng.modifyStudent(modIndex, modStudent);
				break;
			case 5:
				String delName = view.inputName();
				int delIndex = mng.searchIndexByName(delName);
				mng.deleteStudent(delIndex);
				break;
			case 6:
				String checkName = view.inputName();
				view.displayResult(mng.checkScore(checkName));
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
