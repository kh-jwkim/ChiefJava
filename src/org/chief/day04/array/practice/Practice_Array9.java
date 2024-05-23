package org.chief.day04.array.practice;

import java.util.Scanner;

public class Practice_Array9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	메소드 명 : public void practice9(){}
		//	사용자가 입력한 값이 배열에 있는지 검색하여
		//	있으면 “OOO 치킨 배달 가능“, 없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요.
		//	단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요.
		//
		//	ex.
		//	치킨 이름을 입력하세요 : 양념 치킨 이름을 입력하세요 : 불닭
		//	양념치킨 배달 가능 불닭치킨은 없는 메뉴입니다.
		
		Scanner sc = new Scanner(System.in);
		
		String[] menuArray = {"양념","후라이드","간장","불닭","까르보나라","개매운","뿌링클"};
		
		System.out.print("치킨 이름을 입력하세요 : ");
		String inputMenu = sc.next();
		
		int flag=0;
		for(String menu: menuArray) {
			if(menu.equals(inputMenu))
				flag=1;
		}
		if(flag==1)
			System.out.println(inputMenu+"치킨 배달 가능");
		else
			System.out.println(inputMenu+"치킨은 없는 메뉴입니다.");

	}

}
