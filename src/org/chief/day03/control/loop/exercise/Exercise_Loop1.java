package org.chief.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_Loop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Exam01
		//사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
		//단, 입력한 수는 1보다 크거나 같아야 합니다.
		//만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		int inputNum;
		while(true) {
			System.out.println("1 이상의 숫자를 입력해주세요");
			inputNum=sc.nextInt();
			if(inputNum>=1) break;
		}
		
		for(int i=1 ; i <= inputNum ; i++ )
			System.out.print(i+" ");
		System.out.println();
		
		//Exam02
		//사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
		//단, 입력한 수는 1보다 크거나 같아야 합니다.
		
		while(true) {
			System.out.println("1 이상의 숫자를 입력해주세요");
			inputNum=sc.nextInt();
			if(inputNum>=1) break;
		}
		for(int i=0 ; i < inputNum ; i++ )
			System.out.print((inputNum-i)+" ");
		System.out.println();
		
		//Exam03
		//1부터 사용자에게 입력 받은 수까지의 정수들의 합을 for문을 이용하여 출력하세요. 
		int sum = 0;
		while(true) {
			System.out.println("1 이상의 숫자를 입력해주세요");
			inputNum=sc.nextInt();
			if(inputNum>=1) break;
		}
		for(int i=0 ; i <= inputNum ; i++ )
			sum += i;
		System.out.println("정수들의 합 : "+sum);
		
		//Exam04
		//사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
		//만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		int inputNum2 = 0, gap = 0, min;	//생각나는대로 만들었는데 gap 계산하는것보다 min/max 받는게 더 좋았을듯
		while(true) {
			System.out.println("1 이상의 숫자를 입력해주세요");
			System.out.print("첫번째 숫자 : ");
			inputNum=sc.nextInt();
			System.out.print("두번째 숫자 : ");
			inputNum2=sc.nextInt();
			if(inputNum>=1 && inputNum2>=1) break;
		}
		if(inputNum>inputNum2) {
			gap = inputNum - inputNum2;
			min = inputNum2;
		}else {
			gap = inputNum2 - inputNum;
			min = inputNum;
		}
			
		for(int i=0 ; i <= gap; i++) {
			System.out.println((min+i)+" ");
		}
		
		//Exam05
		// 사용자로부터 입력 받은 숫자의 단을 출력하세요.
		System.out.println("정수 하나 입력 : ");
		int dan = sc.nextInt();
		
		if(1<=dan && dan<=9) {
			for(int i=1;i<10;i++) 
				System.out.println(dan+" * "+i+" = "+(dan*i));
		}else System.out.println("2 ~ 9까지의 양수를 입력하여야 합니다");
		
		//Exam06
		System.out.println("정수 하나 입력 : ");
		dan = sc.nextInt();
		
		if(1<=dan && dan<=9) {
			for(; dan<10 ; dan++) 
				for(int i=1 ; i<10; i++)
					System.out.println(dan+" * "+i+" = "+(dan*i));
		}else if(9<dan) System.out.println("9 이하의 숫자만 입력해주세요");
	}

}
