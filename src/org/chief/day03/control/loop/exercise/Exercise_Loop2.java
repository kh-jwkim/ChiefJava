package org.chief.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_Loop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int inputNum;
		
		// 1번
		// 1부터 사용자에게 입력 받은 수까지 중에서
		// 1) 2와 3의 배수를 모두 출력하고
		// 2) 2와 3의 공배수의 개수를 출력하세요.
		
		System.out.print("숫자 입력 : ");
		inputNum = sc.nextInt();
		int commonCount=0;
		for(int i=0; i<=inputNum; i++) {
			if (i%2==0) {
				System.out.println(i);
				if (i%3==0) commonCount++;
			}else if (i%3==0) {
				System.out.println(i);
			}
		}System.out.println("2와 3의 공배수의 갯수 : " + commonCount);
		
		// 2번
		/*
		 * 다음과 같은 실행 예제를 구현하세요.
		 *
		 * ex. 정수 입력 : 3
		 *
		 **
		 ***
		 **
		 *
		 */
		
		System.out.print("숫자 입력 : ");
		inputNum = sc.nextInt();
		for(int i=0; i < inputNum*2; i++) {	//총 라인 수는 inputNum*2-1 만큼이 되어야 함
			if(inputNum-i>=0) {	//inputNum이 i보다 큰 경우 => *을 i 갯수만큼 출력할 때
				for(int j=1; j <= i; j++) {
						System.out.print("*");
				}System.out.println();
			}
			else {	//inputNum이 i보다 작은 경우 => *을 inputNum 갯수에서 하나씩 줄여가야 함
				for(int j=i; (inputNum*2-j) > 0; j++ )	//i가 inputNum보다 크므로 *은 inputNum*2에서 i만큼 뺀 숫자 만큼 출력
					System.out.print("*");				//예)입력을 5로 받고 6번째 라인인 경우 i값은 6, *은 4개만큼 출력 (5*2)-6=4
				System.out.println();
			}
		}
		
		
		// 3번
		/*
		 * 다음과 같은 실행 예제를 구현하세요.
		 *
		 * ex. 정수 입력 : 4
		 *
		 ***
		 *****
		 *******
		 */
		System.out.print("숫자 입력 : ");
		inputNum = sc.nextInt();
		for(int i=1; i<=inputNum; i++) {	//inputNum번째 까지 라인을 출력
			for(int j=1; j<(i*2); j++)		//현재 라인은 i*2-1 번 만큼 *을 출력해야 함
				System.out.print("*");
			System.out.println();
		}
		
		
		// 4번
		/*
		 * 다음과 같은 실행 예제를 구현하세요.
		 *
		 * ex. 정수 입력 : 5
		 *****
		 *     *
		 *     *
		 *     *
		 *****
		 */
		
		System.out.print("숫자 입력 : ");
		inputNum = sc.nextInt();
		//inputNum 만큼의 라인 출력
		for(int i=1; i<=inputNum; i++) {
			//현재 라인이 양 끝 (1번째 ~ 마지막(inputNum)번째) 라인일 경우
			if(i==1 || i==inputNum)
				for(int j=1; j<=inputNum; j++)
					System.out.print("*");
			//현재 라인이 가운데 라인일 경우
			else {
				//라인의 가장 왼쪽에 * 출력
				System.out.print("*");
				//양 끝의 개수인 2를 뺀 만큼의 공백을 출력
				for(int j=1; j<=inputNum-2; j++)
					System.out.print(" ");
				//라인의 가장 오른쪽에 * 출력
				System.out.print("*");
			}
			//다음 라인은 아래에 출력해야 하므로 파라미터 없이 println 실행
			System.out.println();
		}
		
		// 5번
		// 사용자로부터 입력 받은 하나의 값이 소수인지 판별하는 프로그램을 구현하세요.
		// 단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.
		
		System.out.print("숫자 입력 : ");
		inputNum = sc.nextInt();
		
		if(inputNum>=2) {		//입력값이 2보다 큰지 체크
			for(int i=2; i<=inputNum; i++) {	//약수인지 체크할 숫자는 2부터 inputNum 까지
				if(i==inputNum) System.out.println("입력하신 "+inputNum+"은 소수입니다.");	//i가 inputNum이 될 때 까지 나누어 떨어지지 않음
				else if(inputNum%i==0) {	//inputNum이 i로 나누어 떨어짐
					System.out.println("입력하신 "+inputNum+"은 소수가 아닙니다.");
					break;
				}
			}
		}else	//입력값 범위가 틀림
			System.out.println("잘못 입력하셨습니다.");
		
		
		// 6번
		// 위 문제와 모든 것이 동일하나, 입력한 수가 2보다 작은 경우
		// “잘못 입력하셨습니다.”를 출력하면서 다시 사용자가 값을 입력하도록 하세요.
		
		while(true) {		//입력값 받아서 2보다 큰지 체크
			System.out.print("숫자 입력 : ");
			inputNum = sc.nextInt();
			if(inputNum>=2) break;
			System.out.println("잘못 입력하셨습니다.");
		}
		
		for(int i=2; i<=inputNum; i++) {
			if(i==inputNum) System.out.println("입력하신 "+inputNum+"은 소수입니다.");
			else if(inputNum%i==0) {
				System.out.println("입력하신 "+inputNum+"은 소수가 아닙니다.");
				break;
			}
		}
		
		
		// 7번
		// 2부터 사용자가 입력한 수까지의 소수를 모두 출력하고 소수의 개수를 출력하세요.
		// 단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.
		int commCount=0;
		
		while(true) {		//입력값 받아서 2보다 큰지 체크
			System.out.print("숫자 입력 : ");
			inputNum = sc.nextInt();
			if(inputNum>=2) break;
			System.out.println("잘못 입력하셨습니다.");
		}
		for(int i=2; i<=inputNum; i++) {	//2부터 inputNum 까지의 각 숫자들이 소수인지 체크
			for(int j=2; j<=i; j++) {	//위에서 체크하려는 숫자의 mod 연산을 할 숫자는 j 
				if(j==i) {				//i는 소수인 경우 (j값이 i가 될 때 까지 약수가 나오지 않음)
					System.out.print(j+" ");
					commCount++;
				}
				else if(i%j==0) {		//i는 소수가 아닌 경우 (i가 j로 딱 나누어 떨어진 상황)
					break;
				}
			}
		}System.out.println("\n소수의 개수 : "+commCount);


	}

}
