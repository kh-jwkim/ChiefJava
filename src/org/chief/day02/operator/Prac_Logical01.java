package org.chief.day02.operator;

public class Prac_Logical01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		50, 30을 입력받아 다음과 같은 식을 작성 하였을때 결과값을 예상해보고 출력해보자
//		a!=b && a<b;
//		a<b || a==b;
//		a>b && a!=b;
//		a>b || a==b;
		
		int a=50, b=30;
		boolean res;
		
		res=a!=b && a<b;	//false && false = false
		System.out.println("res = "+res);
		res=a<b || a==b;	//false || false = false
		System.out.println("res = "+res);
		res=a>b && a!=b;	//true && true = true
		System.out.println("res = "+res);
		res=a>b || a==b;	//true || false= true
		System.out.println("res = "+res);
		

	}

}
