package org.chief.day01.printbasic;

import java.util.Scanner;

public class Exam_PrintSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//println은 마지막에 자동으로 개행이 된다
		System.out.println("지금까지 쓰던 출력 명령어");
		//print는 마지막에 자동 개행이 없다. 개행을 원한다면 \n 개행문자 입력
		System.out.print("지금까지와는 다른 출력 명령어");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("하나의 수 입력 : ");
		int num = sc.nextInt();
		System.out.println("입력받은 수는 : "+num);
		
		//printf() 메서드가 있다. 포맷을 맞춰서 출력하는데 사용
		System.out.printf("정수 출력 : %d", 57);
	}

}
