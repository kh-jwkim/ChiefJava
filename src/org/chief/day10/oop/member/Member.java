package org.chief.day10.oop.member;

public class Member {
	private String memberId;
	private String memberPw;
	private String memberName;
	private int memberAge;
	private String memberEmail;
	private String memberPhone;
	private String memberAddress;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}
	
	public Member(String id, String pw, String name, int age, String email, String phone, String address) {
		this.memberId = id;
		this.memberPw = pw;
		this.memberName = name;
		this.memberAge = age;
		this.memberEmail = email;
		this.memberPhone = phone;
		this.memberAddress = address;
	}

	//setter
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	//getter
	public String getMemberId() {
		return memberId;
	}
	public String getMemberPw() {
		return memberPw;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public int getMemberAge() {
		return memberAge;
	}
	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public String getMemberPhone() {
		return memberPhone;
	}
	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}
	public String getMemberAddress() {
		return memberAddress;
	}
	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}
	
}
