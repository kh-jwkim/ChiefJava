package org.chief.day04.array.practice;

import java.util.Random;

public class Practice_Array11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	메소드 명 : public void practice11(){}
		//	로또 번호 자동 생성기 프로그램을 작성하는데 중복 값 없이 오름차순으로 정렬하여 출력하세요.
		//
		//	ex.
		//	3 4 15 17 28 40
		
		Random random = new Random();
		int[] res = new int[6];
		
		for(int i=0; i<6; i++) {
			int randNum = random.nextInt(45)+1;
			//System.out.println("i="+i);
			//randNum이 res에 포함된 숫자인지 체크해야 함
			//배열의 처음(0번째) 부터 현개 데이터가 저장된 마지막(i)번째 까지를 체크해야함
			for(int j=0 ; j<i; j++) {
				if(res[j]==randNum) {
					randNum = random.nextInt(45)+1;
					j=0;
				}
			}
			for(int j=0 ; j<i; j++) {
				if(res[j]>randNum) {
					int tmp = res[j];
					res[j] = randNum;
					randNum = tmp;
				}
			}
			
			res[i] = randNum;
			
		}
		for(int i: res)
			System.out.print(i+" ");

	}

}
