package kr.or.iei;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("2 ~ 9 사이의 정수 입력 : ");
			int input = sc.nextInt();	//1. int타입 변수에 String입력되어 문제 발생
			
			if(2<=input && input <= 9) {	//2. 조건을 만족하기 위해서 2<=input 추가하고 &&로 연결하여
											//둘 다 만족하는 경우에 if문이 동작하게 설정
				for(int num=1; num<=9; num++) {
					System.out.printf("%d * %d = %d\n", input, num, (input*num));
					//3. printf의 경우 형식문자의 개수와 타입에 맞춰서 전달값이 있어야 한다
				}
				//4. 문제 내용에 구구단 정상출력 후에 프로그램이 종료되려면 break문 필요
				break;
			}else {
				System.out.println("2이상 9이하의 정수만 입력해주세요.");
			}
		}

	}

}
