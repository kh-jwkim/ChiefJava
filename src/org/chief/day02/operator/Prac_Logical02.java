package org.chief.day02.operator;

public class Prac_Logical02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		70, 55를 a,b로 입력받아 다음과 같은 식을 작성 하였을때 결과값을 예상해보고 출력해보자
//		result1 = a==b || a++<100;
//		result2 = a<b && --b<55;
//		result3 = a!=b && b--<a++;
//		result4 = a++ != b || b++ >= 85;
//		a=?, b=?;
//		result1=?, result2=?, result3=?, result4=?;
		
		int a=70;
		int b=55;
		boolean result1, result2, result3, result4;
		
		result1 = a==b || a++<100;			// a=71, b=55, false||true = true
		result2 = a<b && --b<55;			// a=71, b=55, false&&true = false
		result3 = a!=b && b--<a++;			// a=72, b=54, true&&true = true
		result4 = a++ != b || b++ >= 85;	// a=73, b=54, true||false=true
		System.out.println("a == "+a+", b == "+b);
		System.out.println("result1 = "+result1);
		System.out.println("result2 = "+result2);
		System.out.println("result3 = "+result3);
		System.out.println("result4 = "+result4);
	}

}
