package org.chief.day08.oop.objectarray;

public class Book {
	//제목
	//저자
	String title;		//이름
	String author;		//저자
	
	//생성자
	public Book() {}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public String toString() {
		return "("+this.title+","+this.author+")";
	}
}
