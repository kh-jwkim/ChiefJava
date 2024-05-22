package org.chief.day02.operator;

public class Exam_Comparsion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		비교 연산자
//		더이상 =인 이콜이 아니다
//		이콜은 ==다
//		=은 대입연산자!
		int num1 = 50;
		int num2 = 30;
		boolean result;
		result = (num1 > num2);
		System.out.println("result : "+result);
		result = (num1 < num2);
		System.out.println("result : "+result);
		result = (num1 == num2);
		System.out.println("result : "+result);
		result = (num1 != num2);
		System.out.println("result : "+result);
	}

}
