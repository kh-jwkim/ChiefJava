package org.chief.day12.collection.list;

class Member{
}

public class MemberList {
	Member[] members;
	int size;
	
	public MemberList() {
		// TODO Auto-generated constructor stub
		members = new Member[3];
		size = 0;
	}
	
	//추가
	public void add(Member member) {
		members[size] = member;
		size++;
	}
	
	//조회
	public Member get(int index) {
		return members[index];
//		return members; // Member[]
	}
	
	//크기
	public int size() {
		return size;
	}
	
	//초기화
	public void clear() {
		//1. for문 돌면서 초기화
		//2. 배열 자체 초기화
		members = new Member[3];
		size = 0;
	}
}
