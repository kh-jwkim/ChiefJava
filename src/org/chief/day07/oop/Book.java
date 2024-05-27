package org.chief.day07.oop;

import java.sql.Date;

public class Book {
	//멤버필드
	String title;		//이름
	int price;			//가격
	String author;		//저자
	String category;	//카테고리
	String publisher;	//출판사
	Date publishingDate; //출판날짜
	

	


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
	public void rent() {}
	public void sell() {}
	public void inStock() {}
	
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public Date getPublishingDate() {
		return publishingDate;
	}
	public void setPublishingDate(Date publishingDate) {
		this.publishingDate = publishingDate;
	}
}
