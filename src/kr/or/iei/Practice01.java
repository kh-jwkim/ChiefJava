package kr.or.iei;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String youInput;
		int you, com;
		
		while(true) {
			System.out.println("가위 바위 보 게임을 시작합니다.");
			
			//입력
			System.out.print("가위 바위 보 중 한 개를 입력하세요 : ");
			youInput = sc.next();
			
			System.out.println("당신은 "+youInput+"를 냈습니다.");
			you = youInput.equals("가위") ? 0 : youInput.equals("바위") ? 1 : youInput.equals("보") ? 2 : 3;	//정확한 입력이 아니면 3 저장
			
			//난수 발생
			com = (int)(Math.random()*3);
			System.out.println("컴퓨터는 "+((com==0)?"가위":(com==1)?"바위":"보")+"를 냈습니다.");
			
			if(you != 3) {	//정확한 값을 받은 경우
				if(you==com) {
					System.out.println("비겼습니다. 다시 시작합니다.");
				}else if((you==com-2) || (you==com+1)) {
					System.out.println("당신이 이겼습니다!");
				}else
					System.out.println("당신이 졌습니다!");
			}else			//정확한 입력이 아닌 경우
				System.out.println("입력이 잘못되었습니다.");
			//
		}
		
	}

}
