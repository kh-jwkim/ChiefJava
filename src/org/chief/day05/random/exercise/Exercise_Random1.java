package org.chief.day05.random.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise_Random1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//동전 앞뒤 맞추기!
//		===== 동전 앞 뒤 맞추기 ======
//		숫자를 입력해주세요(1.앞면 / 2.뒷면) : 1
//		맞췄습니다.
//		숫자를 입력해주세요(1.앞면 / 2.뒷면) : 1
//		틀렸습니다.
		
		Scanner sc = new Scanner(System.in);
		int choice;
		
		//Random.nextInt() 사용한 버전/////////////////////////////////////////////////////
		
		System.out.print("숫자를 입력해주세요(1.앞면 / 2.뒷면) : ");
		while((choice=sc.nextInt()) != -1)
		{
		Random rand = new Random();
//		if (choice==rand.nextInt(2)+1)
//			System.out.println("맞췄습니다.");
//		else
//			System.out.println("틀렸습니다.");
		String res = (choice==rand.nextInt(2)+1) ? "맞췄습니다." : "틀렸습니다.";
		System.out.println(res);
		System.out.print("숫자를 입력해주세요(1.앞면 / 2.뒷면) : ");
		}
		
		//math.random() 사용한 버전/////////////////////////////////////////////////////
		
		System.out.print("숫자를 입력해주세요(1.앞면 / 2.뒷면) : ");
		while((choice=sc.nextInt()) != -1)
		{
			String res = (choice==(int)(Math.random()*2+1)) ? "맞췄습니다." : "틀렸습니다.";
			System.out.println(res);
			System.out.print("숫자를 입력해주세요(1.앞면 / 2.뒷면) : ");
		}
		
	}

}
