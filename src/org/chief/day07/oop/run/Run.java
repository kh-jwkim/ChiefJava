package org.chief.day07.oop.run;

import org.chief.day07.oop.Book;

import java.util.Scanner;

import org.chief.day07.oop.Circle;
import org.chief.day07.oop.Member;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Run ex = new Run();
//		ex.memberPractice();
		oopExercise();
		
		Math.random();
		
		
		
		
	}
	
	public static void constructorEx() {
//		Book book = new Book();	//기본 생성자 이용해서 객체 생성
		//title, author는 모두 비어있음
//		book.title = "춘향뎐";
//		book.autor = "작자미상";
		
		Book book = new Book("춘향뎐", "작자미상");
		Book emptyBook = new Book();
		
		System.out.println(book.getTitle()+book.getAuthor());
		System.out.println(emptyBook.getTitle()+emptyBook.getAuthor());
	}
	
	public static void oopExercise() {
		//예제1
		//Circle의 instance를 이용하여
		//이름이 달덩이, 반지름은 5인 Circle의 넓이를 출력
		
		Circle moon = new Circle();			//인스턴스 생성
		moon.name = "달덩이";				//필드값 설정
//		moon.radius = 5;
		moon.setRadius(5);					//setter 메서드로 인스턴스의 필드값 변경
		System.out.println(moon.getName()+moon.getRadius());	//getter 메서드로 인스턴스의 값을 가져온다
		
		double area = moon.getSize();		//메서드는 보유한 필드값으로 연산하여 결과값 리턴
		System.out.println(area);	
		
		Circle donut = new Circle();
//		donut.radius = 2;
		donut.setRadius(2);
		donut.name = "던킨도넛";
		area = donut.getSize();
		System.out.println(area);
	}
	
	public static void memberPractice() {
		Scanner sc = new Scanner(System.in);
		
		Member member1 = new Member();
		member1.name = "일용자";
		member1.age = 33;
		member1.job = "의사";
		
		Member member2 = new Member();
		member2.name = "이용자";
		member2.age = 22;
		
		System.out.println(member1.name);
		System.out.println(member1.job);
		System.out.println(member1.age);
		System.out.println(member2.name);
		System.out.println(member2.job);
		sc.close();
	}

}
