package org.chief.day02.printbasic;

public class Exam_PrintSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("이것이 원래 쓰던거");
		System.out.print("이게 조금 다른거\n");
		
		//형식문자 (printf 에 사용)
//		1. 정수 : %d	//응용 %05d : 숫자를 무조건 5자리로 출력, 값이 5자리가 안되면 빈 부분은 0으로 출력
//		2. 실수 : %f	//응용 %.2f : 소수점을 2자리 까지 출력, 값이 끝자리 까지 없으면 0으로 출력, 값이 2자리보다 많으면 2자리까지만
//		3. 문자 : %c
//		4. 문자열 : %s	//응용 %5s : 문자열을 최소 5자리로 출력, 값이 5자리가 안되면 빈 부분은 공백
		System.out.printf("정수 출력 : %05d, 문자열 출력 : %5s\n", 1023, "일공이삼");
		System.out.println("이제 끝");
		System.out.printf("개강날자 : %.2f, 종강날자 : %.1f\n", 5.7, 10.23);
	}

}
