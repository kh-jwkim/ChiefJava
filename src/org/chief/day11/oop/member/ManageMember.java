package org.chief.day11.oop.member;

public class ManageMember {
	Member[] members;
	int index;
	
	//필드 초기화를 생성자에서
	public ManageMember() {
		members = new Member[5];
		index = 0;
	}
	
	//회원정보저장
	public void insertMember(Member member) {
		if(index<members.length) {
			members[index]=member;
			index++;
		}
	}

	//회원 전체정보
	public Member[] getAllMembers() {
		// TODO Auto-generated method stub
		return members;
	}

	//이메일로 회원 검색
	public Member searchOneByEmail(String email) {
		// TODO Auto-generated method stub
		for(Member member : members) {
			if(member != null && email.equals(member.getMemberEmail())) {
				return member;
			}
		}
		return null;
	}

	public void deleteAllMembers() {
		// TODO Auto-generated method stub
		this.members = new Member[5];
		index = 0;
	}
	
	public void deleteOneMember(String email) {
		// TODO Auto-generated method stub
		
		int i=0;
		for(;i<members.length;i++) {
			if(members[i] != null) {
				if(members[i].getMemberEmail().equals(email)) {
					break;
				}
			}
		}
		if(i!=0) {
			for(;i<members.length;i++) {
				if(i+1 <= members.length){
					members[i] = members[i+1];
				}
			}
		}
		this.members = new Member[5];
		index = 0;
	}
	
	public void updateMember(Member member) {
		int i=0;
		for(Member mOrigin : members) {
			if(mOrigin != null) {
				String memberEmail = mOrigin.getMemberEmail();
				if(memberEmail.equals(member.getMemberEmail())) {
//					mOrigin.setMemberAddress(member.getMemberAddress());
//					mOrigin.setMemberName(member.getMemberName());
//					mOrigin.setMemberPhone(member.getMemberPhone());
					members[i] = member;
				}
			}
		}
	}
	
}
