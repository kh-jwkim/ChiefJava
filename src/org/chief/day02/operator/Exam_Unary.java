package org.chief.day02.operator;

public class Exam_Unary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// a++, ++a -> a = a + 1;
		int a1 = 1;
		System.out.println(++a1);
		System.out.println(a1++);
		System.out.println(a1);
		
//		문제1
//		a가 10, b는 20, c는 30
//		a++;					//a=11,b=20,c=30
//		b = (--a) + b;			//a=10,b=30
//		c = (a++) + (--b);		//a=11,b=29,c=39
//		a, b, c의 값은?
//		a=11,b=9,c=20
		
		int a=10;
		int b=20;
		int c=30;
		a++;					//a=11,b=20,c=30
		b = (--a) + b;			//b=10
		c = (a++) + (--b);		//a=11,b=29,c=39
		System.out.println("a="+a+", b="+b+", c="+c);
//		a=11,b=29,c=39
		
//		문제2
//		논리형 변수 flag를 true로 초기화 하고 다음 연산을 수행하여 결과값 확인
//		!!!!flag;
		boolean flag = true;
		flag = !!!!flag;
		System.out.println(!!!!flag);
		
//		문제3
//		정수형 변수 x=100, y=33, z=0 초기화 후 다음 연산 수행 수 x,y,z를 출력
//		x--;				//x=99,	y=33,	z=0
//		z=x-- + --y;		//x=98,	y=32,	z=131
//		x=99 + x++ + x;		//x=99+98+99=296,	y=32,	z=131
//		y = y-- + y+ ++y;	//x=296,	y=32+31+32=95,	z=131
		int x, y, z;
		x = 100;
		y = 33;
		z = 0;
		
		x--;
		z = x-- + --y;
		x = 99 + x++ + x;
		y = y-- + y+ ++y;
		System.out.println("x=" + x + ", y=" + y + ", z=" + z);
	}

}
