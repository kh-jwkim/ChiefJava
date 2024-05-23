package org.chief.day05.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				System.out.print("첫번째 정수 입력 : ");
				int num1 = sc.nextInt();
				System.out.print("두번째 정수 입력 : ");
				int num2 = sc.nextInt();
			
				System.out.printf("%d을 %d로 나누면 몫은 %d입니다.\n",num1,num2,num1/num2);
			}catch (ArithmeticException e) {
				// TODO: handle exception
				e.printStackTrace();
				System.out.println("0으로 나눌 수 없습니다.");
			}catch (InputMismatchException e) {
				// TODO: handle exception
				e.printStackTrace();
				System.out.println("문자를 입력하셨습니다.");
				sc.next();
//				continue;
			}
			
		}

	}

}
