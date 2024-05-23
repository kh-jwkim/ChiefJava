package org.chief.day05.random.exercise;

import java.util.Scanner;

public class Exercise_Random2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===== 가위 바위 보 게임 =====");
		System.out.print("숫자를 선택하세요(1.가위 / 2.바위 / 3.보) : ");
		int you = sc.nextInt();
		String yourHand = you==1 ? "가위" : you==2 ? "바위" : "보";
		int com = (int)(Math.random()*3 + 1);
		String comHand = com==1 ? "가위" : com==2 ? "바위" : "보";
		System.out.println("=========== 결과 ===========");
		System.out.println("당신은 " + yourHand + "를 냈습니다.");
		System.out.println("컴퓨터는 " + comHand + "를 냈습니다.");
		System.out.println("============================");

		if(you==com)
			System.out.println("비겼습니다.");
		else if(you+1==com || you-2==com) {
			System.out.println("당신이 졌습니다.");
		}
		else {
		System.out.println("당신이 이겼습니다.");
		}
	}

}
