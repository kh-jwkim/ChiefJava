package org.chief.day09.oop.encapsulation;

public class Member {
	
	// 멤버변수(필드)
	private String name;
	private char gender;
	private int age;
	private String education;
	private long salary;
	private String job;
	private long property;
	private String phone;		//숫자 타입으로 안한건 앞자리 0을 못쓰기 때문
	private String address;
	private boolean divorceYN;
	private String children;	//총 몇명인지만 표현할거면 숫자 타입, 다르게 표현할거면 String
	
	public Member() {}	//생성자
	
	// 멤버메소드(메소드)
//	private void resterMember() {}
	public void doHeart() {}
	public void sendMessage() {}
	public void dpPromise() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public long getProperty() {
		return property;
	}

	public void setProperty(long property) {
		this.property = property;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isDivorceYN() {
		return divorceYN;
	}

	public void setDivorceYN(boolean divorceYN) {
		this.divorceYN = divorceYN;
	}

	public String getChildren() {
		return children;
	}

	public void setChildren(String children) {
		this.children = children;
	}
	
}
