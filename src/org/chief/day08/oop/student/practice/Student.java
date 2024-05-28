package org.chief.day08.oop.student.practice;

public class Student {
	String name;
	int firstScore;
	int secondScore;
	
	public Student() {}
	public Student(String name, int first, int second) {
		this.name = name;
		this.firstScore = first;
		this.secondScore = second;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFirstScore() {
		return firstScore;
	}
	public void setFirstScore(int firstScore) {
		this.firstScore = firstScore;
	}
	public int getSecondScore() {
		return secondScore;
	}
	public void setSecondScore(int secondScore) {
		this.secondScore = secondScore;
	}
	
//	public String toString() {
//		return this.name+" 학생의 첫번째 점수는 "+this.firstScore+"점, 두번째 점수는 "+this.secondScore+"점 입니다.";
//	}
}
