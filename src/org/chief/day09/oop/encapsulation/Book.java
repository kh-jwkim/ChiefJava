package org.chief.day09.oop.encapsulation;

import java.sql.Date;

public class Book {
	
	public static void main(String[] args) {
		//필드에 직접 접근(권장x)
//		Book book = new Book();
//		book.title = "춘향뎐";		//다른 클래스에서는 is not visible 나올거임
//		book.author = "작자미상";
		
		//필드에 직접 접근하지 않고 객체 초기화하는 방법
		//생성자를 통해서 초기화
		Book book = new Book("춘향뎐","작자미상");
		
		//setter() 메소드를 이용한 초기화
		Book bookbook = new Book();
		bookbook.setTitle("춘향뎐");
		bookbook.setAuthor("작자미상");
		
		System.out.println(book.getTitle()+","+bookbook.getAuthor());
	}
	
	
	//멤버필드
	private String title;		//이름
	private String author;		//저자

	public Book() {
		this("","");
//		this.title = "무제";
//		this.author = "";
	}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	//멤버메소드

	//얘네를 왜 쓰느냐... 필드에 직접 접근하지 못하게 하고 setter/getter를 통해서 우회접근하게 하려고
	//만드는 규칙
	//1. set을 쓰고 필드명을 낙타표기법(Camelcase)으로 써줌
	//ex) 필드가 name이면 setter() 메소드는 setName()가 됨
	//2. get을 쓰고 필드명을 낙타표기법으로 써줌
	//ex) 필드가 age이면 getter() 메소드는 getAge()가 됨.
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

}
