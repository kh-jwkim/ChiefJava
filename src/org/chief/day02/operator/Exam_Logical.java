package org.chief.day02.operator;

public class Exam_Logical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		논리연산자 예제
//		남자 "이면서" 평균평점 4.3이상인 사람 -> and
//		컴퓨터공학과 "또는" 경영학과인 사람 -> or
		boolean result1, result2, result3, result4;
//		AND -> &&, OR -> ||
		int num1 = 50;
		int num2 = 30;
		
		result1 = (num1 == num2) && (num1 < num2);	// false && false == false
		System.out.println("결과값1 : "+result1);
		
		result2 = (num1 < num2) || (num1 == num2);	// false || false == false
		System.out.println("결과값2 : "+result2);
		
		result3 = (num1 > num2) && (num1 != num2);	// true && true == true
		System.out.println("결과값3 : "+result3);
		
		result4 = (num1 > num2) || (num1 == num2);	// true || False == true
		System.out.println("결과값4 : "+result4);
	}

}
