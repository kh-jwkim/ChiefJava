package org.chief.day04.control.loop;

public class Exam_ForDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		중첨 for문 - for문 안의 for문
//		문법
//		for () { for () {} }
		
//		for(int i=2; i<10; i++)
		//1. i는 2일 때 시작해서
		//2. 안에 있는 for문으로 2단 출력
		//5. i++로 3이 되어서
		//6. 안에 있는 for문으로 3단 출력
		//7. 1-6번이 반복되어 i<10이 false가 되므로 중첩 for문 동작 끝
		
//			for(int j=1; j<10; j++)
				//3. i단 출력중
//				System.out.printf("%d * %d = %2d\n",i,j,i*j);
			//4. i단 출력이 모두 끝나면 바깥 for문제 증가식 동작
		
		for(int i=1; i<10; i++) {			//i는 현재의 단에 곱할 수
			for(int j=2; j<10; j++) {		//j는 구구단의 단 수
				System.out.printf("%d * %d = %2d   ", j, i, i*j);
			}
			System.out.println();
		}
		
	}

}
