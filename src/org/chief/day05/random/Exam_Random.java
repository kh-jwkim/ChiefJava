package org.chief.day05.random;

import java.util.Random;

public class Exam_Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand = new Random();
		int rNum = rand.nextInt(10);
		
		System.out.println(rNum);
		
		// 1 ~ 10 사이의 랜덤한 수를 구하시오
		// rand.nextInt(10) : 0 ~ 9 사이의 랜덤한 수
		// rand.nextInt(10)+1 : 1 ~ 10 사이의 랜덤한 수
		for(int i=0; i<10; i++)
			System.out.print(rand.nextInt(10)+1 +" ");

		System.out.println();
		
		//25 부터 35 사이의 랜덤한 수를 출력하시오
//		System.out.println(rand.nextInt(11)+25);
		
		//1 또는 2의 랜덤한 수를 출력
//		System.out.println(rand.nextInt(2)+1);
		
		
		//Math는 내장클래스라서 따로 import 안해줘도 된다!!
		//Math.random()은 0 이상 1 미만의 값을 출력!
		double randNum = Math.random();
		System.out.println((int)(randNum*10));
		
		//25 ~ 35 사이의 값
		System.out.println((int)(Math.random()*11) + 25);
	}

}
