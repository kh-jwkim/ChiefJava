package org.chief.day12.collection.student;

public class Student {
	private String name;
	private int firstScore;
	private int secondScore;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String name, int firstScore, int secondScore) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.firstScore = firstScore;
		this.secondScore = secondScore;
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

	
	@Override
	public String toString() {
		return "Student [name=" + name + ", firstScore=" + firstScore + ", secondScore=" + secondScore + "]";
	}

	@Override
	public int hashCode() {		//HashSet에서는 내부적으로 hashCode(), equals() 메서드를 이용해서 중복값 체크를 하는듯
		// TODO Auto-generated method stub
//		return super.hashCode();
		return (this.name+this.firstScore+this.secondScore).hashCode();
	}

	@Override
	public boolean equals(Object obj) {//HashSet에서는 내부적으로 hashCode(), equals() 메서드를 이용해서 중복값 체크를 하는듯
		// TODO Auto-generated method stub
//		return super.equals(obj);
		Student std = (Student)obj;
		if(this.name.equals(std.getName()) && this.firstScore == std.getFirstScore() && this.secondScore == std.getSecondScore()) {
			return true;
//			return true;
		} else {
			return false;
		}
//		if (obj instanceof Student) {
//			return this.hashCode() == std.hashCode();
////			return true;
//		} else {
//			return false;
//		}
		
//		return this.name.equals(std.getName());
	}
	

	
}
