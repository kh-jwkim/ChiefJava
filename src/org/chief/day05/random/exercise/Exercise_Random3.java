package org.chief.day05.random.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise_Random3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Random rng = new Random();
		
		int game=0, win=0, lose=0;
		
		while(true) {
			System.out.println("===== UP & Down Game =====");
			System.out.println("1. Game Start");
			System.out.println("2. Game Score");
			System.out.println("3. End Game");
		
			System.out.print("Choose Menu : ");
			
			switch (sc.nextInt()) {
			case 1:
				System.out.println("<< Game Start >>");
				System.out.print("Input Number : ");
				int inputNum = sc.nextInt();
				int randNum = rng.nextInt(98)+1;
				
				if(inputNum == randNum) {
					System.out.println("<< 정답 >>");
					win++;
				}else if(inputNum > randNum)
					System.out.println("<< U P >>");
				else
					System.out.println("<< DOWN >>");
				game++;
				
				break;
				
			case 2:
				System.out.println("<< Game Score >>");
				System.out.printf("현재 스코어 - %d게임 중 %d번 승리\n",game,win);
				break;
				
			case 3:
				System.out.println("<< Good Bye~ >>");
				return;

			default:
				System.out.println("1~3번 메뉴중에 선택해주세요");
				break;
			}
			
		}

	}

}
