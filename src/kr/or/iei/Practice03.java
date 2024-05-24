package kr.or.iei;

import java.util.Scanner;

public class Practice03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int inputNum, randNum, sum=0;
		
		while(true) {
			System.out.print("배열의 크기 입력 : ");
			inputNum = sc.nextInt();
			if(inputNum>0) 
				break;
			else
				System.out.println("배열의 크기는 양수로 입력해야 합니다!");
		}
		
		int[] randArr = new int[inputNum];
		
		for(int i=0; i<inputNum; i++) {
			randNum = (int)(Math.random()*100+1);
			for(int j=0; j<inputNum; j++) {
				if(randArr[j]==randNum) {
					j=0;
					randNum = (int)(Math.random()*100+1);
				}
			}randArr[i] = randNum;
			
		}
		
		for(int i: randArr)
			sum+=i;
		System.out.println("sum = "+sum);
		
		sc.close();
	}

}
