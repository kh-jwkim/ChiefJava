package org.chief.day11.oop.member;

import java.util.Scanner;

public class ViewMember {

	public int mainMenu() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 회원관리 프로그램 ======");
		System.out.println("1. 회원가입");
		System.out.println("2. 회원검색");
		System.out.println("3. 회원 전체정보 조회");
		System.out.println("4. 회원정보 수정");
		System.out.println("5. 회원정보 삭제");
		System.out.println("6. 회원정보 검색하여 삭제");
		System.out.println("0. 종료");
		System.out.println("메뉴 선택 : ");
		int menu = sc.nextInt();
		
		return menu;
	}

	public void displayMessage(String message) {
		// TODO Auto-generated method stub
		System.out.println(message);
	}
	
	public Member inputMember() {
		Scanner sc = new Scanner(System.in);
		Member member = new Member();
		
		System.out.print("이름 : ");
		member.setMemberName(sc.next());
		System.out.print("이메일 : ");
		member.setMemberEmail(sc.next());
		System.out.print("전화번호 : ");
		member.setMemberPhone(sc.next());
		System.out.print("주소 : ");
		sc.nextLine();
		member.setMemberAddress(sc.nextLine());	//공백까지 String안에 포함시켜준다.
		System.out.println();
		
		return member;
	}

	public void printAllMembers(Member[] members) {
		// TODO Auto-generated method stub
		System.out.println("====== 회원 전체정보 출력 ======");
		for(Member member : members) {
			if (member != null) {
				System.out.println(member.toString());
			}
		}
	}

	public void printOneMember(Member member) {
		// TODO Auto-generated method stub
		System.out.println("====== 회원 검색결과 ======");
		if(member!=null) {
			System.out.println("이름 : " + member.getMemberName());
			System.out.println("전화번호 : " + member.getMemberPhone());
			System.out.println("주소 : " + member.getMemberAddress());
			System.out.println("이메일 : " + member.getMemberEmail());
		}else
			System.out.println("검색결과가 없습니다.");
	}

	public String inputEmail(String category) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(category+"할 이메일 입력 : ");
		String email = sc.next();
		return email;
	}

	public Member modifyMember(String memberEmail) {
		// TODO Auto-generated method stub
		//memberEmail = email;
		Scanner sc = new Scanner(System.in);
		Member member = new Member();	//인스턴스를 만들어서 값을 복사 후 리턴
										//->웹에서는 이런 형태를 더 자주 사용하게 된다고 함
		
		System.out.println("====== 회원정보수정 ======");
		System.out.print("이름 : ");
		member.setMemberName(sc.next());
		System.out.print("이메일 : ");
		member.setMemberEmail(sc.next());
		System.out.print("전화번호 : ");
		member.setMemberPhone(sc.next());
		System.out.print("주소 : ");
		sc.nextLine();
		member.setMemberAddress(sc.nextLine());	//공백까지 String안에 포함시켜준다.
		System.out.println();
		
		return member;
	}
	public void modifyMember(Member member) {	//인스턴스 추가 생성없이 그대로 수정해본 형태
												//객체의 응집도 면에서 안좋을 수 있을듯...
		// TODO Auto-generated method stub
		//memberEmail = email;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("====== 회원정보수정 ======");
		System.out.print("이름 : ");
		member.setMemberName(sc.next());
		System.out.print("이메일 : ");
		member.setMemberEmail(sc.next());
		System.out.print("전화번호 : ");
		member.setMemberPhone(sc.next());
		System.out.print("주소 : ");
		sc.nextLine();
		member.setMemberAddress(sc.nextLine());	//공백까지 String안에 포함시켜준다.
		System.out.println();
	}

//	public String modifyInput() {
//		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		System.out.println("수정할 이메일 입력 : ");
////		String email = sc.next();
////		return email;
//		return sc.next();
//	}

}
