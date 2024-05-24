package kr.or.iei;

import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int inputNum;
		
		do {
			System.out.print("1~100 사이의 정수를 입력하세요 : ");
			inputNum = sc.nextInt();
		}while(inputNum<0 || inputNum>100);	//while의 조건식이 true인 경우(1~100 바깥의 수) 루프 유지
		
		for(int i=2; i<inputNum; i++) {
			if(inputNum%i==0) {			//입력받은 수가 더 작은수로 나누어 떨어지는 경우
				System.out.println(inputNum+"은 소수가 아닙니다.");
				break;
			}else if(2*i>inputNum) {	//입력받은 수보다 작은 수로 나누어 떨어지지 않은 경우
				System.out.println(inputNum+"은 소수입니다.");
				break;
			}
				
		}
		
		sc.close();
		
	}

}
