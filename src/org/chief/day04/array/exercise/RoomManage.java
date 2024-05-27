package org.chief.day04.array.exercise;

import java.util.Scanner;

public class RoomManage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		boolean[] room = new boolean[10];
		
//		for(boolean i: room)
//			System.out.println(i);
		
		
		while(true) {
			System.out.println("모텔 관리 프로그램 v1.0");
			System.out.printf("%-8s%-8s%-8s%-8s","1.입실","2.퇴실","3.방보기","4.종료");
			System.out.print("선택 > ");
			int select = sc.nextInt();
			
			switch (select) {
			case 1:
				System.out.print("몇번방에 입실하시겠습니까? ");
				room[sc.nextInt()] = true;
				break;
				
			case 2:
				System.out.print("몇번방에서 퇴실하시겠습니까? ");
				room[sc.nextInt()] = false;
				break;
				
			case 3:
				for(int i=0; i<room.length; i++) {
					if(!room[i]) 
						System.out.println(i+"번방이 현재 비어있습니다");
					else
						System.out.println(i+"번방이 사용중입니다");
				}
				break;
				
			case 4:
				System.out.println("프로그램을 종료합니다");
				return;
				
			default:
				System.out.println("잘못된 메뉴입니다.");
				break;
			}
			
		}
		
	}

}
