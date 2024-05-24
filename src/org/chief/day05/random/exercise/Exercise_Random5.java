package org.chief.day05.random.exercise;

import java.util.Scanner;

public class Exercise_Random5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int game=0, win=0, lose=0, draw=0, money=10000;
		
		while(true) {
			System.out.println("===== Dice Game =====");
			System.out.println("1. Game Start");
			System.out.println("2. Game Score");
			System.out.println("3. End Game");
		
			System.out.print("Choose Menu : ");
			
			switch (sc.nextInt()) {
			case 1:
				System.out.println("<< Game Start >>");
				
				game++;
				
				int yourSum = 0, comSum = 0, bet;		//게임의 승패를 결정할 sum값
				String command;
				char select;
				boolean flag=true;
				
					
				for(int turn=0; turn<3; turn++) {
					System.out.print("당신이"+(turn+1)+"번째 주사위를 굴립니다... ");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO: handle exception
						e.printStackTrace();
					}
					int dice = (int)( (Math.random()*6) + 1);
					yourSum += dice;
					System.out.println("주사위의 값은 "+dice+"!!");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				}
				System.out.println("당신의 주사위의 합 : "+yourSum);
				
				while(true) {
					System.out.print("배팅을 하겠습니까(y/n) : ");
					command = sc.next(); 
					select = command.charAt(0);
					if (command.length()==1 && (select=='y' || select=='n' || select=='Y' || select=='N'))
						break;
					System.out.println("y 또는 n을 입력해 주세요.");
				}
				
				if(select=='y') {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO: handle exception
						e.printStackTrace();
					}
					
					System.out.println("배팅을 하셨습니다.");
					
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO: handle exception
						e.printStackTrace();
					}
					
					while(true) {
						System.out.print("얼마를 거시겠습니까? [당신의 소지금:"+money+"] : ");
						bet = sc.nextInt();
						if (bet<=money && bet>=0)
							break;
						System.out.println("소지금 범위 내에서 입력하세요.");
					}
					
					
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO: handle exception
						e.printStackTrace();
					}
					
					for(int turn=0; turn<3; turn++) {
						System.out.print("컴퓨터가 "+(turn+1)+"번째 주사위를 굴립니다... ");
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							// TODO: handle exception
							e.printStackTrace();
						}
						int dice = (int)( (Math.random()*6) + 1);
						comSum += dice;
						System.out.println("주사위의 값은 "+dice+"!!");
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							// TODO: handle exception
							e.printStackTrace();
						}
					}System.out.println("컴퓨터의 주사위의 합 : "+comSum);
					
					if(yourSum>comSum) {
						System.out.println("당신이 이겼습니다!!!");
						money+=bet;
						win++;
					}else if(yourSum<comSum) {
						System.out.println("당신이 졌습니다...");
						money-=bet;
						lose++;
					}else {
						System.out.println("비겼습니다.");
						draw++;
					}
					System.out.println("현재 당신의 소지금은 "+money+" 입니다.");
					if(money==0) {
						System.out.println("돈이 다 떨어지셨네요... << Good Bye~ >>");
						return;
					}
				}
				
				break;
				
				
			case 2:
				System.out.println("<< Game Score >>");
				System.out.printf("현재 스코어 - %d게임 중 %d번 승리, %d번 패배, %d번 무승부\n현재 소지금 : %d\n", game, win, lose, draw, money);
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
