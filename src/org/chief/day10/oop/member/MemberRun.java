package org.chief.day10.oop.member;

public class MemberRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//회원관리 프로그램
		//1. 회원가입
		//2. 회원검색
		//3. 회원정보보기
		ViewMember view = new ViewMember();
		ManageMember mng = new ManageMember();
		
		end:
		while(true) {
			
			int menu = view.printMenu();
			switch (menu) {
			case 1:
				Member member = view.inputNember();
				mng.registerMember(member);
				break;
			case 2:
				String memberId = view.inputMemberId();
				member = mng.searchOneById(memberId);
				view.displayMember(member); 
				break;
			case 3:
//				member = mng.allMember();
//				view.displayMember(member);
				Member[] members = mng.allMember();
				view.displayMemberList(members);
				break;
			case 4:
				view.printMessage("프로그램을 종료하겠습니다.");
				break end;

			default:
				System.out.println("잘못입력하셨습니다.");
				break;
			}
		}
		
		
		
		//4. 회원정보수정
		//5. 회원정보삭제
	}

}
