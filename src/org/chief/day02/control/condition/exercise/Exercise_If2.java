package org.chief.day02.control.condition.exercise;

import java.util.Scanner;

public class Exercise_If2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		문제2
//		커피메뉴를 입력받고 가격을 알려주는 프로그램을 작성하시오
//		주문하시겠어요? 가격을 알려드립니다.
//		(에스프레소, 카푸치노, 카페라떼, 아메리카노)
//		메뉴를 입력해주세요 : 에스프레소
//		2500원 입니다.
//		메뉴를 입력해주세요 : 자바칩프라푸치노
//		없는 메뉴입니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주문하시겠어요? 가격을 알려드립니다.");
		System.out.println("(에스프레소, 카푸치노, 카페라떼, 아메리카노)");
		System.out.print("메뉴를 입력해주세요 : ");
		String menu = sc.next();
		
		//int price=0;
		var price=0;
		
		//문자열 비교는 == 연산자로 불가능하다! ==를 쓰면 문자열이 아닌 문자열 객체의 주소값 비교를 하기 때문!!
		if(menu.equals("에스프레소")) {
			price = 2500;
		}
		else if(menu.equals("카푸치노")) {
			price = 2700;
		}
		else if(menu.equals("카페라떼")) {
			price = 2800;
		}
		else if(menu.equals("아메리카노")) {
			price = 2500;
		}
		else {
			System.out.println("없는 메뉴입니다.");
		}
		
		if (price !=0) {
			System.out.println(price+"원 입니다.");
		}
		
	}

}
