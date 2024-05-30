package org.chief.day10.oop.member;

import java.util.Scanner;

public class ViewMember {
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 회원관리 프로그램 ======");
		System.out.println("1. 회원가입");
		System.out.println("2. 회원검색");
		System.out.println("3. 회원정보보기");
		System.out.println("4. 종료");
		System.out.println("메뉴 선택 : ");
		int menu = sc.nextInt();
		
		return menu;
	}
	
	public void printMessage(String msg) {
		System.out.println(msg);
	}

	public Member inputNember() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Member member = new Member();
		System.out.println("====== 회원가입 ======");
		
		System.out.print("아이디 : ");
		member.setMemberId(sc.next());
		System.out.print("비밀번호 : ");
		member.setMemberPw(sc.next());
		System.out.print("이름 : ");
		member.setMemberName(sc.next());
		System.out.print("나이 : ");
		member.setMemberAge(sc.nextInt());
		System.out.print("이메일 : ");
		member.setMemberEmail(sc.next());
		System.out.print("전화번호 : ");
		member.setMemberPhone(sc.next());
		System.out.print("주소 : ");
		sc.nextLine();
		member.setMemberAddress(sc.nextLine());	//공백까지 String안에 포함시켜준다.
		System.out.println();
		
//		return new Member(memberId,memberPw,memberName,memberAge,memberEmail,memberPhone,memberAddress);
		return member;
	}
	
	public void displayMember(Member member) {
		System.out.println("====== 회원 정보 보기 ======");
		if(member == null) {
			System.out.println("해당하는 회원은 존재하지 않습니다.");
			return;
		}
		System.out.printf("아이디 : %s, 이름 : %s, 나이 : %d\n주소 : %s\n",
				member.getMemberId(),member.getMemberName(),member.getMemberAge(),member.getMemberAddress());
	}
	
	public void displayMemberList(Member[] members) {
		for(Member member : members) {
			if(member != null) {
				System.out.println("====== 회원 정보 보기 ======");
				System.out.printf("아이디 : %s, 이름 : %s, 나이 : %d\n주소 : %s\n",
						member.getMemberId(),member.getMemberName(),member.getMemberAge(),member.getMemberAddress());
			}else
				break;
		}
	}
	
	public String inputMemberId() {
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 아이디 입력 : ");
		String memberId = sc.next();
		return memberId;
	}
}
