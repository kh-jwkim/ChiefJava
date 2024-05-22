package org.chief.day03.control.loop.exercise;

public class Exercise_While1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		While문을 이용하여 1 ~ 100사이의 홀수의 합을 출력하세요
//		1 ~ 100 사이의 홀수의 합 : ?
		
		int i=0, sum=0;
		
		while(++i<100) {
			if(i%2==1) sum+=i;
		}System.out.println("1 ~ 100 사이의 홀수의 합 : "+sum);
		
	}

}
