package org.chief.miniproject.FarmingMudGame;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Status stat = new Status();
		Field field = new Field();
		Store store = new Store();
		
		System.out.println("농사 머드게임");
		
		end :
		while(true) {
			System.out.println("┌──────────────────────────────────────┐");
			System.out.println("│            메           뉴           │");
			System.out.println("├────────────┬────────────┬────────────┤");
			System.out.printf("│ %6s │ %6s │ %6s │\n","1.작물확인","2.상    점","3.밭 갈 기");
			System.out.printf("│ %6s │ %6s │ %6s │\n","4.작물심기","5.물뿌리기","6.수확하기");
			System.out.printf("│ %6s │ %6s │ %6s │\n","7.자러가기","8.상태확인","9.종료하기");
			System.out.println("└────────────┴────────────┴────────────┘");
			System.out.print("메뉴 입력 : ");
			int choiceMenu = sc.nextInt();
			int x, y;
			
			switch (choiceMenu) {
			case 1:
				System.out.println("<<작물확인>>");
				field.checkField();
				break;
			case 2:
				System.out.println("<<상    점>>");
				System.out.print("1.구매하기   2.판매하기  3.돌아가기\n선택 : ");
				switch (sc.nextInt()) {
				case 1:
					store.printProduct();
					store.buyProduct(stat);
					break;
				case 2:
					store.sellProduct(stat);
					break;
				case 3:
					System.out.println("이전 메뉴로 돌아갑니다.");
					break;

				default:
					System.out.println("잘못된 입력값입니다.");
					break;
				}
				break;
			case 3:
				System.out.println("<<밭 갈 기>>");
				field.checkField();
				System.out.print("x좌표 : ");
				x = sc.nextInt();
				System.out.print("y좌표 : ");
				y = sc.nextInt();
				field.plowing(x, y);
				break;
			case 4:
				System.out.println("<<작물심기>>");
				
				break;
			case 5:
				System.out.println("<<물뿌리기>>");
				
				break;
			case 6:
				System.out.println("<<수확하기>>");
				field.checkField();
				System.out.print("x좌표 : ");
				x = sc.nextInt();
				System.out.print("y좌표 : ");
				y = sc.nextInt();
				field.harvest(x, y);
				break;
			case 7:
				System.out.println("<<자러가기>>");
				
				break;
			case 8:
				System.out.println("<<상태확인>>");
				stat.inventoryCheck();
				stat.statCheck();
				break;
			case 9:
				System.out.println("게임을 종료합니다.");
				sc.close();
				break end;

			default:
				System.out.println("잘못된 메뉴 선택입니다.");
				break;
			}
		}
	}

}
