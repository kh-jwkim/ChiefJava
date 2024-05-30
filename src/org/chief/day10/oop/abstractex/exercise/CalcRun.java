package org.chief.day10.oop.abstractex.exercise;

public class CalcRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		GoodCalc calc = new GoodCalc();
		int[] array = {5, 7, 10, 23};
		
		Calculator calc = new GoodCalc();		//추상클래스는 업캐스팅 해서 사용할 수는 있음!
		
		System.out.println("합 : "+calc.add(5, 7));				// 5 7
		System.out.println("차 : "+calc.substract(10, 23));		// 10 23
		System.out.println("평균 : "+calc.average(array));		// {5, 7, 10, 23}
		System.out.println("평균 : "+calc.average(new int[]{5, 7, 10, 23}));	// 5 7 10 23
	}

}
