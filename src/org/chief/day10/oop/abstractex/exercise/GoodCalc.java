package org.chief.day10.oop.abstractex.exercise;

public class GoodCalc extends Calculator {

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int substract(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double average(int[] a) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int num: a)
			sum+=num;
//		for(int i=0; i<a.length; i++) {
//			int num = a[i];
//		}
		return (double)sum/a.length;
	}

}
