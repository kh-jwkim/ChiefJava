package org.chief.day02.operator;

import java.util.Scanner;

public class Exam_Triple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*삼항연산자
		(조건식) ? 참일때값 : 거짓일때값
		
		- 조건식은 반드시 true/false로 반환
		- 비교/논리연산자 주로 사용
		- 조건식에 따라서 ':' 문자의 왼쪽 또는 오른쪽 값이 리턴됨
		*/
		
		//예제1 정수를 입력받아 짝수인지 홀수인지 판별하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요 : ");
		int num = sc.nextInt();
		String res;
//		res = ((num % 2) == 0) ? "짝": "홀";
		System.out.println("입력받은 값은 "+(((num % 2) == 0) ? "짝": "홀")+"입니다.");
		//System.out.println("입력받은 값은 "+res+"수 입니다.");
	}

}
