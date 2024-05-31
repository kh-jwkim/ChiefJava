package org.chief.day11.oop.member;

public class MemberRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ViewMember view = new ViewMember();
		ManageMember mng = new ManageMember();
		exit:
		while(true) {
			int choice = view.mainMenu();
			switch (choice) {
			case 1 :
				//회원가입
				Member member = view.inputMember();
				mng.insertMember(member);
				break;
			case 2 :
				//회원검색(이메일)
				String email = view.inputEmail("검색");
				member = mng.searchOneByEmail(email);
				view.printOneMember(member);
				break;
			case 3 :
				//회원 전체정보 출력
				Member[] members = mng.getAllMembers();
				view.printAllMembers(members);
				break;
			case 4 :
				//회원 정보 수정
				email = view.inputEmail("수정");
				member = mng.searchOneByEmail(email);
				if(member != null) {
//					member = view.modifyMember(member);
					view.modifyMember(member);
				}
				break;
			case 5 :
				mng.deleteAllMembers();
				break;
			case 6 :
				email = view.inputEmail("삭제");
				mng.deleteOneMember(email);
				break;
			case 0 :
				view.displayMessage("프로그램을 종료합니다.");
				break exit;

			default:
				view.displayMessage("잘못입력하셨습니다.");
				break;
			}
		}
	}

}
