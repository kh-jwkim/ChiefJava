package org.chief.day05.random.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise_Random4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Random rng = new Random();
		
		int game=0, win=0, lose=0, flag=0;
		
		while(true) {
			System.out.println("===== Baskin Robbins31 Game =====");
			System.out.println("1. Game Start");
			System.out.println("2. Game Score");
			System.out.println("3. End Game");
		
			System.out.print("Choose Menu : ");
			
			switch (sc.nextInt()) {
			case 1:
				System.out.println("<< Game Start >>");
				
				game++;
				
				int sum = 0;		//게임의 승패를 결정할 sum값
				
				while(true) {
					int inputNum;
					
					do System.out.print("Input Number( 1 ~ 3 ) : ");
					while((inputNum=sc.nextInt())<1 || inputNum>3);
					
					for(int i=0; i<inputNum; i++) {
						System.out.println(++sum + "!");
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							// TODO: handle exception
							e.printStackTrace();
						}
					}
					
					if(sum>=31) {
						System.out.println("L O S E~");
						lose++;
						break;
					}
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO: handle exception
						e.printStackTrace();
					}
					System.out.println("<<Computer Turn>>");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO: handle exception
						e.printStackTrace();
					}
					
					int randNum = (int)(Math.random()*3+1);
					
					for(int i=0; i<randNum; i++) {
						System.out.println(++sum + "!");
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							// TODO: handle exception
							e.printStackTrace();
						}
					}
					
					if(sum>=31) {
						System.out.println("W I N!!");
						win++;
						break;
					}
					
					
				}
				
				
				break;
				
			case 2:
				System.out.println("<< Game Score >>");
				System.out.printf("현재 스코어 - %d게임 중 %d번 승리, %d번 패배\n",game,win,lose);
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
