package org.chief.day10.oop.member;

public class ManageMember {
	
//	private Member member = new Member();
	private Member[] members;
	private int index;
//	= new Member[5];
	
	public ManageMember() {
		members = new Member[5];
		index = 0;
	}
	
	public void registerMember(Member member) {
//		this.member = member;
		if(index < members.length) {
			members[index] = member;
			index++;
		}
	}
	
	public Member[] allMember() {
//		return member;
		return members;
	}

	public Member searchOneById(String memberId) {
		// TODO Auto-generated method stub
		for(Member member: members) {
			if(member != null && memberId.equals(member.getMemberId()))
				return member;
		}
		return null;
	}
}
