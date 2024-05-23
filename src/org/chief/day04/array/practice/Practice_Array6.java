package org.chief.day04.array.practice;

import java.util.Scanner;

public class Practice_Array6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	메소드 명 : public void practice6(){}
		//	“월“ ~ “일”까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력 받아
		//	입력한 숫자와 같은 인덱스에 있는 요일을 출력하고
		//	범위에 없는 숫자를 입력 시 “잘못 입력하셨습니다“를 출력하세요.
		//
		//	ex.
		//	0 ~ 6 사이 숫자 입력 : 4 0 ~ 6 사이 숫자 입력 : 7
		//	금요일 잘못 입력하셨습니다.
		
		Scanner sc = new Scanner(System.in);
		String[] week = {"월", "화", "수", "목", "금", "토", "일"};
		int day;
		
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		while((day=sc.nextInt())<0 || day>6)
			System.out.print("잘못 입력하셨습니다.\n\n0 ~ 6 사이 숫자 입력 : ");
		
		System.out.println(week[day]);

	}

}
