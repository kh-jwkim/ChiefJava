package org.chief.day09.oop.encapsulation;

public class Student {
	private String name;
	private int firstScore;
	private int secondScore;
	
	public Student() {}
	public Student(String name, int first, int second) {
		this.name = name;
		this.firstScore = first;
		this.secondScore = second;
	}
	
	// setter() 메소드
	public void setName(String name) {
		this.name = name;
	}
	public void setFirstScore(int firstScore) {
		this.firstScore = firstScore;
	}
	public void setSecondScore(int secondScore) {
		this.secondScore = secondScore;
	}
	
	// getter() 메소드
	public String getName() {
		return name;
	}
	public int getFirstScore() {
		return firstScore;
	}
	public int getSecondScore() {
		return secondScore;
	}
	
	
	public String toString() {
		return this.name+" 학생의 첫번째 점수는 "+this.firstScore+"점, 두번째 점수는 "+this.secondScore+"점 입니다.";
	}
}
